package cn.czwdz.carsale.user.controller;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.czwdz.carsale.manager.pojo.*;
import cn.czwdz.carsale.manager.service.RedisUtils;
import cn.czwdz.carsale.user.service.*;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;





@Controller
public class MyController {

	@Autowired
	UserSerice userService;

	@Autowired
	CarOrderService carOrderService;

	@Autowired
	CarInfoService carInfoService;

	@Autowired
	HistoryOrderService historyOrderService;

	@Autowired
	FavService favService;
	@Autowired
	FriendService friendService;
	@Autowired
	RedisUtils redisUtils;

	@RequestMapping("/login111")
	public String checkLogin(Model model, String username, String upassword, HttpSession httpSession) {
		List<User> sc = userService.login(username, upassword);
		System.out.println("+++++++++++++咋回事儿啊");
		if (sc != null) {
			String userid = userService.findidbyname(username);
			httpSession.setAttribute("userid", userid);
			System.out.println("登录成功=============");
			return "redirect:/Welcome";
		}
		System.out.println("登录失败===========");
		return "user/Login";

	}

	@RequestMapping("/UserCenter")
	@ResponseBody
	public String UserCenter(@RequestParam("photos") MultipartFile photos, Model model, User user,
			HttpServletRequest request) throws IOException {

		System.out.println("=============遍历对象============" + user);
		// 获取上传文件的name
		String fname = photos.getOriginalFilename();
		System.out.println("图片名为======" + fname);

		// 文件上传
		// 1.获取服务器地址
		String path = request.getSession().getServletContext().getRealPath("/files/");

		// 2.写入服务器
		FileUtils.copyInputStreamToFile(photos.getInputStream(), new File(path + "/" + fname));

		user.setuPhoto(fname);

		int sc = userService.update(user);
		if (sc != 0) {
			System.out.println("修改成功");
			return "修改成功";
		}
		System.out.println("修改失败");
		return "修改失败";

	}

	@RequestMapping("/Welcome")
	public String Welcome(Model model,String userid,HttpSession httpSession) {
		/* String userid = (String) httpSession.getAttribute("userid"); */
		User li = userService.findCommon(userid);
		httpSession.setAttribute("userid", userid);
		model.addAttribute("li", li);
		
		return "user/Welcome";

	}

	@RequestMapping("/UpdateUser")
	public String show0(Model model, HttpSession httpSession) {
		
		String userid = (String) httpSession.getAttribute("userid");
		System.out.println(userid+"dddddddddddddddddddddddddddddddddddddd");
		User li = userService.findCommon(userid);

	////根据ID，i查找对应好友及人际关系
		List<Friend> lo = friendService.findFriend(userid);
		System.out.println(lo+"dddddddddddddddddddddddddddddddddddddd");
		List<User> la = new ArrayList<User> ();
		for(int i=0;i<lo.size();i++){
			User lc = userService.findCommon(lo.get(i).getUid());
			
			la.add(lc);
			System.out.println(la+"ddddddssssssssssssssssssssssss");
		}	
//		Integer.parseInt(la.get(j).getInternetstatus())
		for(int i=0;i<la.size()-1;i++){
			for(int j=0;j<la.size()-1-i;j++){
				if(Integer.parseInt(la.get(j).getInternetstatus())>Integer.parseInt(la.get(j+1).getInternetstatus())){
					Collections.swap(la, j, j+1);
				}
			}
		}
		System.out.println("==================="+la);
	    model.addAttribute("la", la);
	    
		model.addAttribute("li", li);
		return "user/UserCenter";

	}
	//ajax实时刷新好友列表
	@RequestMapping(value = "/SellerNewsRight", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String SellerNewsRight(Model model, String uid, String upassword, HttpSession httpSession) {
		String userid = (String) httpSession.getAttribute("userid");
		
		
	////根据ID，i查找对应好友及人际关系
			List<Friend> lo = friendService.findFriend(userid);
			
			List<User> la = new ArrayList<User> ();
			for(int i=0;i<lo.size();i++){
				User lc = userService.findCommon(lo.get(i).getUid());
				la.add(lc);
			}	
//			Integer.parseInt(la.get(j).getInternetstatus())
			for(int i=0;i<la.size()-1;i++){
				for(int j=0;j<la.size()-1-i;j++){
					if(Integer.parseInt(la.get(j).getInternetstatus())>Integer.parseInt(la.get(j+1).getInternetstatus())){
						Collections.swap(la, j, j+1);
					}
				}
			}
			
			String json = JSONArray.toJSONString(la);
		return json;
	}

	@RequestMapping("/PreUpdatePwd")
	public String show3(Model model, String uid, String upassword, HttpSession httpSession) {
		userService.updatepwd(uid, upassword);

		String userid = (String) httpSession.getAttribute("userid");

		User li = userService.findCommon(userid);

		model.addAttribute("li", li);
		return "user/UpdatePwd";
	}

	@RequestMapping(value = "/checkPwd", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String checkPwd(String pwd, HttpSession httpSession) {

		String userid = (String) httpSession.getAttribute("userid");

		String pp = userService.findPwd(userid);
		// System.out.println(pwd.length());
		String str = "";
		if (pwd.equals(pp)) {
			str = "*";
		} else {
			str = "密码错误";
		}
		return JSONArray.toJSONString(str);
	}

	@RequestMapping(value = "/checkPwd1", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String checkPwd1(String pwd1, String pwd) {
		String str = "";
		// System.out.println(pwd1+"pwd1**********");
		// System.out.println(pwd+"pwd**********");
		if (pwd1.equals(pwd)) {
			str = "新密码与旧密码相同";
		} else {
			System.out.println(pwd.length());
			if (pwd.length() == 6 && !pwd1.equals(pwd)) {
				str = "*";
			} else {

				str = "密码长度为六位";
			}
		}
		return JSONArray.toJSONString(str);
	}

	@RequestMapping(value = "/checkPwd2", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String checkPwd2(String pwd1, String pwd2) {
		String str = "";
		if (pwd2.equals(pwd1)) {
			str = "*";
		} else {
			if (pwd2.length() != 6) {
				str = "密码长度为六位";
			} else {

				str = "两次输入不一致";
			}
		}
		return JSONArray.toJSONString(str);
	}

	// 修改密码
	@RequestMapping("/UpdatePwd")
	public String updatePwd(String newPassword1, HttpSession httpSession) {
		// System.out.println(newPassword1);
		String userid = (String) httpSession.getAttribute("userid");
		Integer sc = userService.updatepwd(userid, newPassword1);
		if (sc != null) {
			System.out.println("修改成功");
			return "Welcome";
		}
		return "user/Welcome";
	}
	

	
	@RequestMapping("/DoCollection")
	public String DoCollection(Model model,String carId, HttpSession httpSession) {
		String uId = (String) httpSession.getAttribute("userid");
		int sc = favService.addCollection(carId, uId);
		System.out.println(sc);
		
		return "redirect:/SellerNews";
	}
   //删除收藏夹内容
	@RequestMapping("/collectionCancel")
	public String collectionCancel(Model model, String carId,String userId) {

		redisUtils.hdel(userId+"Fav",carId);

		return "redirect:/Collection";
	}

	// 查询收藏夹
	@RequestMapping("/Collection")
	public String collection(Model model, HttpSession httpSession) {
		List<Fav> lf = favService.collection();
		// for(Fav fav:lf){
		// System.out.println(fav);
		// }
		String userid = (String) httpSession.getAttribute("userid");
		Map maps = redisUtils.hmget(userid+"Fav");
		Set<String> set = maps.keySet();
		List<CarInfo> lis = new ArrayList();
		for (String carNum:set
			 ) {
			CarInfo carInfo=carInfoService.help(carNum);
			lis.add(carInfo);
		}
		/*User li = userService.findCommon(userid);*/
       model.addAttribute("userId",userid);
       model.addAttribute("lis",lis);

		return "user/Collection";
	}

	// 查询卖家历史
	@RequestMapping("/SellerSold")
	public String SellerSold(Model model,
			@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
			HttpSession httpSession) {
		// PageHelper.startPage(pageIndex, 4);
		String userid = (String) httpSession.getAttribute("userid");
		List<HistoryOrder> his = historyOrderService.buyCar();
		User li = userService.findCommon(userid);
		
		model.addAttribute("li", li);
		model.addAttribute("his", his);
		PageInfo<HistoryOrder> page = new PageInfo<HistoryOrder>(his);
		// for(HistoryOrder he:his){
		// System.out.println(he);
		// }
		if (his != null) {
			model.addAttribute("page", page);
			return "user/SellerSold";
		}
		return "user/SellerSold";

	}

	// 查询买家 历史
	@RequestMapping("/BuyerHistory")
	public String buyerHistory(Model model, HttpSession httpSession) {
		String userid = (String) httpSession.getAttribute("userid");

		List<HistoryOrder> bu = historyOrderService.sellCar();
		// for (HistoryOrder bi : bu) {
		// System.out.println(bi);
		// }
		User li = userService.findCommon(userid);

		model.addAttribute("li", li);
		model.addAttribute("bu", bu);
		return "user/BuyerHistory";
	}

	// <!-- 2.2 卖家订单确认 -->
	@RequestMapping("/SellerDepend")
	public String SellerDepend(Model model, HttpSession httpSession) {
		List<CarOrder> c = carOrderService.unCommit0();
		System.out.println("===========================SellerDepend=========================");
		// for(CarOrder car:c){
		// System.out.println(car);
		// }
		String userid = (String) httpSession.getAttribute("userid");
		User li = userService.findCommon(userid);

		model.addAttribute("li", li);
		model.addAttribute("uf", c);
		return "user/SellerDepend";
	}

	// buyerunfinsh和usernews

	@RequestMapping("/PreBuyerUnFinsh")
	public String PreBuyerUnFinsh(Model model, String orderId) {
		System.out.println("==================" + orderId);
		int sc = carOrderService.updateStatus(orderId);
		if (sc != 0) {
			System.out.println("修改成功");
			return "redirect:/BuyerUnFinsh";
		}
		System.out.println("修改失败");
		return "redirect:/BuyerUnFinsh";

	}

	@RequestMapping("/PreSellerDepend")
	public String PreSellerDepend(Model model, String orderId) {
		System.out.println("==================" + orderId);
		int sc = carOrderService.updateStatus(orderId);
		if (sc != 0) {
			System.out.println("修改成功");
			return "redirect:/SellerDepend";
		}
		System.out.println("修改失败");
		return "redirect:/SellerDepend";

	}

	// <!-- 买家订单确认 -->
	@RequestMapping("/BuyerUnFinsh")
	public String BuyerUnFinsh(Model model,
			@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
			HttpSession httpSession) {
		// 十条数据
		PageHelper.startPage(pageIndex, 4);
		List<CarOrder> carorder = carOrderService.unCommitBuyer();
		PageInfo<CarOrder> page = new PageInfo<CarOrder>(carorder);
		// System.out.println("===========================BuyerUnFinsh=========================");
		// for (CarOrder car : carorder) {
		// System.out.println(car);
		// }

		System.out.println("00000000" + page.getPages());
		if (carorder != null) {
			model.addAttribute("page", page);

			String userid = (String) httpSession.getAttribute("userid");
			System.out.println(" 输出userid=========" + userid);
			User li = userService.findCommon(userid);

			model.addAttribute("li", li);

			return "user/BuyerUnFinsh";
		}
		if (pageIndex >= page.getPages()) {
			pageIndex = page.getPages();
		}
		// model.addAttribute("carorder", carorder);

		return "user/BuyerUnFinsh";
	}

	// <!-- 卖方已发布汽车信息 -->
	@RequestMapping("/SellerNews")
	public String SellerNews(Model model,
			@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
			HttpSession httpSession) {
		PageHelper.startPage(pageIndex, 4);

		List<CarInfo> ls = carInfoService.faBuCarCollection();
		PageInfo<CarInfo> page = new PageInfo<CarInfo>(ls);

		List<String> la = carInfoService.carnames();
		model.addAttribute("la", la);
		System.out.println(la);
		model.addAttribute("pageIndex", pageIndex);
		System.out.println("00000000" + page.getNavigatePages());

		if (ls != null) {
			model.addAttribute("page", page);

			String userid = (String) httpSession.getAttribute("userid");
			User li = userService.findCommon(userid);

			model.addAttribute("li", li);

			return "user/SellerNews";
		}

		return "user/SellerNews";
	}

	// <!-- 卖方已发布汽车信息 -->
	@RequestMapping(value = "/likefind", produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public String likefind(Model model,
			@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
			@RequestParam(value = "carId", required = false) String carId,
			@RequestParam(value = "carName", required = false) String carName,
			@RequestParam(value = "confName", required = false) String confName,
			@RequestParam(value = "sc", required = false) Integer sc) {
		PageHelper.startPage(pageIndex, 4);
		System.out.println(sc);
		// System.out.println("我可已进来");
		List<CarInfo> li = carInfoService.likefind(carId, carName, confName, sc);

		for (CarInfo aaa : li) {
			System.out.println("看看拼接" + aaa);
		}
		;

		PageInfo<CarInfo> page = new PageInfo<CarInfo>(li);

		// model.addAttribute("page", page);
		String json = JSONArray.toJSONString(page);

		return json;
	}

	
	@RequestMapping("/PreSellerSoldUpdate")
	public String PreSellerSoldUpdate(Model model, HttpSession httpSession, @Param("carId") String carId) {
		System.out.println("汽车id================================" + carId);
		HistoryOrder rng = historyOrderService.buyCarById(carId);

		// System.out.println("============获取到的uid为"+rng.getUser().getUid());
		// System.out.println("=================="+rng);

		// 将汽车id与uid保存至session中
		httpSession.setAttribute("carId", carId);
		httpSession.setAttribute("uId", rng.getUser().getuId());

		String userid = (String) httpSession.getAttribute("userid");
		User li = userService.findCommon(userid);

		model.addAttribute("li", li);
		
		model.addAttribute("rng", rng);
		return "user/SellerSoldUpdate";
	}

	@RequestMapping("/SellerSoldUpdate")
	@ResponseBody
	public String SellerSoldUpdate(Model model, HttpSession httpSession,
			@RequestParam(value = "confName", required = false) String confName,
			@RequestParam(value = "price", required = false) Double price,
			@RequestParam(value = "carAge", required = false) Double carAge,
			@RequestParam(value = "uphone", required = false) String uphone) {
		System.out.println("得到的手机号为==========" + uphone);

		String carId = (String) httpSession.getAttribute("carId");
		String uId = (String) httpSession.getAttribute("uId");

		int sc = carInfoService.UpdateCarById(confName, price, carAge, carId);

		int sg = userService.updateById(uId, uphone);
		if (sc != 0 && sg != 0) {
			System.out.println("修改成功了");
		}
		return "redirect:/SellerSold";
	}
	
	@RequestMapping("/PreBuyerHistoryUpdate")
	public String PreBuyerHistoryUpdate(Model model, HttpSession httpSession, @Param("carId") String carId) {
		System.out.println("汽车id================================" + carId);
		HistoryOrder rng = historyOrderService.sellCarById(carId);

		// System.out.println("============获取到的uid为"+rng.getUser().getUid());
		// System.out.println("=================="+rng);

		// 将汽车id与uid保存至session中
		httpSession.setAttribute("carId", carId);
		httpSession.setAttribute("uId", rng.getUser().getuId());

		String userid = (String) httpSession.getAttribute("userid");
		User li = userService.findCommon(userid);

		model.addAttribute("li", li);
		
		model.addAttribute("rng", rng);
		return "user/BuyerHistoryUpdate";
	}

	@RequestMapping("/BuyerHistoryUpdate")
	@ResponseBody
	public String BuyerHistoryUpdate(Model model, HttpSession httpSession,
			@RequestParam(value = "confName", required = false) String confName,
			@RequestParam(value = "price", required = false) Double price,
			@RequestParam(value = "carAge", required = false) Double carAge,
			@RequestParam(value = "uphone", required = false) String uphone) {
		System.out.println("得到的手机号为==========" + uphone);

		String carId = (String) httpSession.getAttribute("carId");
		String uId = (String) httpSession.getAttribute("uId");

		int sc = carInfoService.UpdateCarById(confName, price, carAge, carId);

		int sg = userService.updateById(uId, uphone);
		if (sc != 0 && sg != 0) {
			System.out.println("修改成功了");
		}
		return "redirect:/BuyerHistory";
	}
}
