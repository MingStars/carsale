package cn.czwdz.carsale.login.controller;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.czwdz.carsale.login.service.UserLoginService;
import cn.czwdz.carsale.login.util.CodeUtil;
import cn.czwdz.carsale.login.util.MD5Util;
import cn.czwdz.carsale.manager.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;



@Controller
@RequestMapping("/login")
public class UserController {
	@Autowired
	private UserLoginService uService;
	private User user;
	User us = new User();

	@RequestMapping("/getCode")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 调用工具类生成的验证码和验证码图片
		Map<String, Object> codeMap = CodeUtil.generateCodeAndPic();

		// 将四位数字的验证码保存到Session中。
		HttpSession session = req.getSession();
		session.setAttribute("code", codeMap.get("code").toString());

		// 禁止图像缓存。
		resp.setHeader("Pragma", "no-cache");
		resp.setHeader("Cache-Control", "no-cache");
		resp.setDateHeader("Expires", -1);
		resp.setContentType("image/jpeg");
		// 将图像输出到Servlet输出流中。
		ServletOutputStream sos;
		try {
			sos = resp.getOutputStream();
			ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
			sos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@RequestMapping("/dongtong")
	public String login(){
		return "login-multi";
	}

//shiro登陆验证
	// 用户登录使用shiro进行验证
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	@ResponseBody
		public String checkLogin1(String userName,String password, String checkcode, HttpServletRequest request) {
			User user = new User();
			user.setUserName(userName);
			user.setuPassword(password);
			User user1 = uService.selectByUserName(userName);
		    User user2 = uService.selectByuStatus(userName);
		    String code = request.getParameter("code");
		    String sessionCode = request.getSession().getAttribute("code").toString();
			HttpSession session = request.getSession();
	      			
			if (code.equalsIgnoreCase(sessionCode)) {
				if(user1!=null) {
				  if(user2!=null) {
	        		Subject subject = SecurityUtils.getSubject();// 获取当前用户登录对象，现在状态为“未认证”
	        		// 用户名和密码令牌
	        		AuthenticationToken token = new UsernamePasswordToken(user.getUserName(),
	        		MD5Util.encode2hex(user.getuPassword()));
	        						try {
	        							subject.login(token);
	        							User loginUser = (User) subject.getPrincipal();
	        							System.out.println(loginUser.getuId());
	        							session.setAttribute("user", loginUser.getuId());
	        							// 登录成功，跳转到首页
	        							return "success";
	        						} catch (Exception e) {
	        							e.printStackTrace();
	        							// 验证失败，重定向到登录页面
	        							return "redirect:" + request.getContextPath() + "/login-multi.jsp";
	        						}
			                     }
				          return "nonactivated";
	        					}
				          return "register";
		                    	}
			              return "code";
	        				}
						
	

	
	  // 用户登录
	  
	/*
	 * @RequestMapping("/checkLogin")
	 * 
	 * @ResponseBody public String checkLogin(HttpServletRequest request,
	 * HttpServletResponse response, String userName, String password) { User user
	 * =uService.checkLogin(userName, MD5Util.encode2hex(password)); User user1
	 * =uService.selectByUserName(userName); User user2 =
	 * uService.selectByuStatus(userName); String code
	 * =request.getParameter("code"); // 验证验证码 String sessionCode
	 * =request.getSession().getAttribute("code").toString(); if (user1 != null) {
	 * if (user != null) { if (user2 != null) { if
	 * (code.equalsIgnoreCase(sessionCode)) {
	 * request.getSession().setAttribute("user", user.getuId()); return "success"; }
	 * return "code"; } return "nonactivated"; } return "fail"; } return"register";
	 * }
	 */
	 

	/*
	 * @RequestMapping("/home") public String home() { return "/home1.1"; }
	 */
	@RequestMapping("/home")
	public String home() {
		return "/index";
	}

	/**
	 * 新用户注册GO
	 * 
	 * @param userName
	 * @return
	 */
	// 查询用户名是否可用
	@RequestMapping(value = "/selectByUserName", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String selectByUserName(String userName) {
		user = uService.selectByUserName(userName);
		String str = "";
		if (user != null) {
			str = "用户名已被占用，请重新输入!";
		} else {
			str = "用户名可用";
		}
		return JSONArray.toJSONString(str);
	}

	// 查询邮箱是否可用
	@RequestMapping(value = "/selectByuEmail", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String selectByuEmail(String uEmail) {
		user = uService.selectByuEmail(uEmail);
		String str = "";
		if (user != null) {
			str = "该邮箱已被使用!";
		} else {
			str = "邮箱可用";
		}
		return JSONArray.toJSONString(str);
	}
	//修改密码
		@RequestMapping("/updatePWD")
	    public String updatePWD(String email,Model model) {
			model.addAttribute("email", email);
	        return "updatePassword";
	    }
		@RequestMapping(value = "/selectuEmail", produces = { "application/json;charset=utf-8" })
		public String selectuEmail(String uPassword,String email) {
			System.out.println(uPassword+email);
			user = uService.selectuEmail(MD5Util.encode2hex(uPassword), email);
			return "/verification/success";
		}
	
	
	

	// 查询手机号是否可用
	@RequestMapping(value = "/selectByuPhone", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String selectByuPhone(String uPhone) {
		user = uService.selectByuPhone(uPhone);
		String str = "";
		if (user != null) {
			str = "该手机号已被注册!";
		} else {
			str = "手机号可用";
		}
		return JSONArray.toJSONString(str);
	}

	@RequestMapping(value = "/register", produces = { "application/json;charset=utf-8" })
	public String load(HttpServletRequest request, HttpServletResponse response, String action) throws Exception {
		if ("'register'".equals(action)) {
			// 注册
			uService.processRegister(request);// 发邮箱激活
			// mav.addObject("text","注册成功,等待验证");
			return "/verification/register_success";
		} else if ("activate".equals(action)) {
			// 激活
			uService.processActivate(request);// 调用激活方法
//            	System.out.println("============================"+str);
//            	response.getWriter().print("<script>alert("+str+")</script>");
			return "/verification/activate_success";
		}
		return "login-multi";
	}

	@RequestMapping("/registerLogin")
	public String insertLogin() {
		return "login-multi";
	}
	
	@RequestMapping("/one")
	public String Login() {

		return "login-multi";
	}
	
	

	// 忘记密码
	// 查询邮箱是否存在
	@RequestMapping("/updateByuEmail")
	@ResponseBody
	public String updateByuEmail(String uEmail) {
		user = uService.selectByuEmail(uEmail);
		if (user != null) {
			return null;
		}
		return "uEmail";
	}

	@RequestMapping("/updatePassword")
	public String updatePassword(HttpServletRequest request, String action) {
		user = uService.selectByuEmail(request.getParameter("uEmail"));
		if (user != null) {
			if ("'register'".equals(action)) {
				uService.updatePassword(request);
				return "/verification/activate_failure";
			}
		} else {
			return "login-multi";
		}
		return null;
	}

	// 游客访问
	@RequestMapping("/visitorLogin")
	public String vistorLogin() {
		return "/index";
	}

	// 管理员登录
	@RequestMapping("/adminLogin")
	@ResponseBody
	public String checkAdminLogin(String userName, String password,HttpServletRequest request) {
		User user1 = uService.checkAdminLogin(userName, MD5Util.encode2hex(password));
		User user = new User();
		user.setUserName(userName);
		user.setuPassword(password);
			if(user1!=null) {
			  
        		Subject subject = SecurityUtils.getSubject();// 获取当前用户登录对象，现在状态为“未认证”
        		// 用户名和密码令牌
        		AuthenticationToken token = new UsernamePasswordToken(user.getUserName(),
        		MD5Util.encode2hex(user.getuPassword()));
        						try {
        							subject.login(token);
        							User loginUser = (User) subject.getPrincipal();
        							System.out.println(loginUser.getuId());
        							
        							// 登录成功，跳转到首页
        							return "success";
        						} catch (Exception e) {
        							e.printStackTrace();
        							// 验证失败，重定向到登录页面
        							return "redirect:" + request.getContextPath() + "/login-multi.jsp";
        						}
        					}
			          return "fail";
	                    	}
	

	@RequestMapping("/admin")
	public String admin() {
		return "/admin/history";
	}
}
