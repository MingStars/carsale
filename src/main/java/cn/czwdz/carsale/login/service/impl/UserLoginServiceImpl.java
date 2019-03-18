package cn.czwdz.carsale.login.service.impl;

import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import cn.czwdz.carsale.login.dao.UserLoginDao;
import cn.czwdz.carsale.login.service.UserLoginService;
import cn.czwdz.carsale.login.util.MD5Util;
import cn.czwdz.carsale.login.util.SendMailUtil;
import cn.czwdz.carsale.manager.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	private UserLoginDao uDao;

	@Override
	public User checkLogin(@Param("username")String userName, @Param("password")String uPassword) {
		return uDao.checkLogin(userName,uPassword);
	}
	
	@Override
	public User selectByuStatus(String userName) {
		return uDao.selectByuStatus(userName);
	}
	
	@Override
	public Integer addUser(User user) {
		return uDao.addUser(user);
	}
	
	@Override
	public Integer updateuStatus(User user) {
		return uDao.updateuStatus(user);
	}
	
	@Override
	public User selectByUserName(String userName) {
		return uDao.selectByUserName(userName);
	}

	@Override
	public User selectByuEmail(String uEmail) {
		return uDao.selectByuEmail(uEmail);
	}
	
	@Override
	public User selectByuPhone(String uPhone) {
		return uDao.selectByuPhone(uPhone);
	}
	
	 @Override
	    public void processRegister(HttpServletRequest request){
	                User user = new User();
	                Random random = new Random();
	                int result = random.nextInt(2000000000);
	                user.setuId(String.valueOf(result));
	                user.setUserName(request.getParameter("userName"));
	                user.setuPassword(MD5Util.encode2hex(request.getParameter("uPassword")));
	                user.setuEmail(request.getParameter("uEmail"));
	                user.setuPhone(request.getParameter("uPhone"));
	                user.setuRegisterTime(new Date());
	                user.setuValidateCode(MD5Util.encode2hex(request.getParameter("uEmail"))); //将邮箱做MD5加密后用作激活码
	                user.setuLoadTime(new Date());
	                user.setuStatus(0);
	                uDao.addUser(user);
	                StringBuffer sb = new StringBuffer("东通二手车账号激活：</br>");
	                sb.append("点击下面链接激活账号，48小时生效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
	                sb.append("<a href=\"http://localhost:8080/carsale/login/register?action=activate&email=");
	                sb.append(user.getuEmail());
	                sb.append("&validateCode=");
	                sb.append(user.getuValidateCode());
	                sb.append("\">http://localhost:8080/carsale/login/register?action=activate&email=");
	                sb.append(user.getuEmail());
	                sb.append("&validateCode=");
	                sb.append(user.getuValidateCode());
	                sb.append("</a>");
	                //发送邮件
	                SendMailUtil.send(user.getuEmail(), sb.toString());
	                System.out.println("发送邮件");
	    }

	    public String processActivate(HttpServletRequest request){
	        //数据访问层，通过email获取用户信息
	        User user=uDao.selectByuEmail(request.getParameter("email"));
	        //验证用户是否存在
	        if(user!=null) {
	            //验证用户激活状态
	            if(user.getuStatus()==0) {
	                ///没激活
	                Date currentTime = new Date();//获取当前时间
	                //验证链接是否过期
	                if(currentTime.before(user.getLastActivateTime())) {
	                    //验证激活码是否正确
	                    if(request.getParameter("validateCode").equals(user.getuValidateCode())) {
	                        //激活成功， //并更新用户的激活状态，为已激活
	                        user.setuStatus(1);//把状态改为激活
	                        uDao.updateuStatus(user);
	                    } 
	                        return "激活成功!";
	                } 
	                	return "激活码已过期!";
	            } 
	            	return "邮箱已激活，请登录!";
	        }
	        	return "该邮箱未注册(邮箱地址不存在)!";
	    }
	    @Override
		public void updatePassword(HttpServletRequest request) {
	    	User user = new User();
			 StringBuffer sb = new StringBuffer("东通二手车账号修改密码 ：</br>");
	         sb.append("点击下面链接跳转至密码修改界面！</br>");
	         sb.append("<a href=\"http://localhost:8080/carsale/login/updatePWD?email=");
	         sb.append(request.getParameter("uEmail"));
	         sb.append("\">http://localhost:8080/carsale/login/updatePWD?email=");
	         sb.append(request.getParameter("uEmail"));
	         sb.append("</a>");
	         //发送邮件
	         SendMailUtil.send(request.getParameter("uEmail"), sb.toString());
	         System.out.println("发送邮件");
		}
	@Override
	public User checkAdminLogin(String userName, String uPassword) {
		return uDao.checkAdminLogin(userName, uPassword);
	}
	@Override
	public User selectuEmail(String uPassword,@Param("email")String uEmail) {
		return uDao.selectuEmail(uPassword, uEmail);
	}
}
