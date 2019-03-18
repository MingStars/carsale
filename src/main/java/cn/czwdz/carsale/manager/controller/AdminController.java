package cn.czwdz.carsale.manager.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.czwdz.carsale.manager.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import cn.czwdz.carsale.carshow.service.ChassisService;
import cn.czwdz.carsale.carshow.service.EngineServices;
import cn.czwdz.carsale.carshow.service.ExternalService;
import cn.czwdz.carsale.carshow.service.InfoService;
import cn.czwdz.carsale.carshow.service.InternalService;
import cn.czwdz.carsale.carshow.service.SafetyServices;
import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarOrder;
import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import cn.czwdz.carsale.manager.pojo.Pic;
import cn.czwdz.carsale.manager.pojo.User;

@Controller
public class AdminController {
@Autowired
private AdminService  adminService;
@Autowired
private AdminUserService adminUserService;
@Autowired
private AdminCarService adminCarService;
@Autowired
private AdminOrderService adminOrderService;
@Autowired
private AdminPicService adminPicService;
    
@Autowired 
private ChassisService chassis;
@Autowired
private EngineServices engine;
@Autowired
private ExternalService external;
@Autowired
private InfoService info;
@Autowired
private InternalService internal;
@Autowired 
private SafetyServices safety;
@Autowired
private RedisUtils redisUtils;




//后台首页
	@RequestMapping("/doGet")
	@ResponseBody
	public String doGetHistoryOrderByName (@RequestParam(value="historyId",required=false)String historyId,@RequestParam(value="buyer",required=false)String buyer,
			@RequestParam(value="car",required=false)String car,@RequestParam(value="seller",required=false)String seller,@RequestParam(value="current",required=false)Integer current,Model model) {
		if(current==null) {
			current=1;
		}
		model.addAttribute("itemsList", adminService.getHistoryOrderByName(historyId, buyer, car, seller, current));
		List<HistoryOrder> res =adminService.getHistoryOrderByName(historyId, buyer, car, seller, current); 
		  String json=JSONArray.toJSONString(res);
		  return json;
	}
	
	//跳转页面
	@RequestMapping("/doGetURL")
	public String doGetURL(String page) {
		
		return page;
	}
	
	
	
	
	//后台用户管理所有用户
	@RequestMapping("/dogetUserByPhone")
	@ResponseBody
	public String doGetUserByName (@RequestParam(value="uPhone",required=false)String uPhone,@RequestParam(value="uId",required=false)String uId,@RequestParam(value="userName",required=false)String userName) {
		List<User> res =adminUserService.getUserByPhone(uPhone,uId,userName); 
		  for (User user : res) {
				user.setuTran("<a href='../dogetTranById?uId="+user.getuId()+"'>查看</a>");
				user.setSign("<a href='../dogetTranById?uId="+user.getuId()+"'>操作</a>");
				
			}
		  String json=JSONArray.toJSONString(res);
		  return json;
	}
	
	//后台查询用户交易记录
	@RequestMapping("/dogetTranById")
	@ResponseBody
	public String doGetTranById (@RequestParam(value="uId",required=false)String uId,Model model){
		List<User> res = adminUserService.getUserTran(uId); 
		
		  String json=JSONArray.toJSONString(res);
		  return json;
	}
	
	//后台查询买家
	@RequestMapping("/doGetBuyerUser")
	@ResponseBody
	public String doGetBuyerUser(Model model) {
		List<User> res = adminUserService.getBuyUser();
		for (User user : res) {
			user.setSign("<a href='../doGetBuyerUserLike?user="+user.getuId()+"'>查看</a>");
		}
		  String json=JSONArray.toJSONString(res);
		  return json;
	}

	//后台查询买家浏览信息
	@RequestMapping("/doGetBuyerUserLike")
	@ResponseBody
	public String doGetBuyerUserLike(Model model,String user) {
		Map<Object,Object> maps =  redisUtils.hmget(user);
        Set<Object> set = maps.keySet();
		for (Object carId:set
			 ) {
          CarInfo carInfo= info.getInfo(Integer.parseInt(carId.toString()));
		}




		String json=JSONArray.toJSONString(maps);
		return json;
	}




	//后台查询卖家
	@RequestMapping("/doGetSelllerUser")
	@ResponseBody
	public String doGetSelllerUser(Model model) {
		List<User> res = adminUserService.getSellerUser(); 
		  String json=JSONArray.toJSONString(res);
		  return json;	
	}
	@RequestMapping("/ddd")
	public String toAll() {
		return "admin/orderManager/completed";
		
	}
	
	
	//后台查询所有车
	@RequestMapping(value="/doGetCarById",produces={"application/json;charset=utf-8"})
	@ResponseBody
	public String doGetCarById(@RequestParam(value="carId",required=false)String carId,@RequestParam(value="sellerId",required=false)String sellerId,@RequestParam(value="isLocked",required=false)String isLocked) {
		//model.addAttribute("itemsList", adminCarService.getCarInfo(carId, licenseAddress, isLocked));
		
		//return adminCarService.getCarInfo(carId, licenseAddress, isLocked);
		
		  List<CarInfo> res = adminCarService.getCarInfo(carId, sellerId,isLocked); 
		  for (CarInfo carInfo : res) {
			carInfo.setSign("<a href='../doUpdateCarById?type=edit&carId="+carInfo.getCarId()+"'>修改</a>");
		}
		  String json=JSONArray.toJSONString(res);
		  
		  return json;
		 
		
	}
	
	

	
	//后台审核,修改之前查询车辆信息
	@RequestMapping(value="/doUpdateCarById",produces={"application/json;charset=utf-8"})
	public String doUpdateCarById(@RequestParam(value="carId",required=false)String carId,@RequestParam(value="type",required=false)String type,Model model) {
		//model.addAttribute("itemsList", adminCarService.getCarInfo(carId, licenseAddress, isLocked));
		
		//return adminCarService.getCarInfo(carId, licenseAddress, isLocked);
		//调用查询车辆所有信息
		  //List<CarInfo> res = adminCarService.getCarInfo(carId, null,null); 
		  //model.addAttribute("res", res);
		if(type.equals("edit")) {
			model.addAttribute("carChassisBrakeInfo",chassis.getChassis(Integer.valueOf(carId)));
			model.addAttribute("carEngineInfo",engine.getEngine(Integer.valueOf(carId)));
			model.addAttribute("carExternalInfo",external.getExternal(Integer.valueOf(carId)));
			model.addAttribute("carInfo",info.getInfo(Integer.valueOf(carId)));
			model.addAttribute("carInternalInfo",internal.getInternal(Integer.valueOf(carId)));
			model.addAttribute("carSafetyInfo",safety.getSafety(Integer.valueOf(carId)));

			return "admin/carManager/editCar";
		}else if(type.equals("audite")) {
			model.addAttribute("carChassisBrakeInfo",chassis.getChassis(Integer.valueOf(carId)));
			model.addAttribute("carEngineInfo",engine.getEngine(Integer.valueOf(carId)));
			model.addAttribute("carExternalInfo",external.getExternal(Integer.valueOf(carId)));
			model.addAttribute("carInfo",info.getInfo(Integer.valueOf(carId)));
			model.addAttribute("carInternalInfo",internal.getInternal(Integer.valueOf(carId)));
			model.addAttribute("carSafetyInfo",safety.getSafety(Integer.valueOf(carId)));
			return "admin/carManager/auditeCarOne";
		}
		  return null;
		  }
	
	
	//后台查询待审核车
	@RequestMapping("/doGetCarAudite")
	@ResponseBody
	public String doGetCarAudite(Model model) {
		List<CarInfo> res = adminCarService.getCarAudite(); 
		for (CarInfo carInfo : res) {
			carInfo.setSign("<a href='../doUpdateCarById?type=audite&carId="+carInfo.getCarId()+"'>修改</a>");
		}
		  String json=JSONArray.toJSONString(res);
		  return json;

		
	}
	//后台查询可出售车
	@RequestMapping("/doGetCarSalable")
	@ResponseBody
	public String doGetCarSalable(Model model) {
		List<CarInfo> res =  adminCarService.getCarSalable(); 
		for (CarInfo carInfo : res) {
			carInfo.setSign("<a href='../doUpdateCarById?type=edit&carId="+carInfo.getCarId()+"'>修改</a>");
		}
		
		  String json=JSONArray.toJSONString(res);
		  return json;
		
	}
	//后台查询已被预约车
	@RequestMapping("/doGetCarBooked")
	@ResponseBody
	public String doGetCarBooked(Model model) {
		
		List<CarOrder> res = adminCarService.getCarBooked(); 
		  String json=JSONArray.toJSONString(res);
		  return json;
		
	}
	//后台查询已出售车
	@RequestMapping("/doGetCarSaled")
	@ResponseBody
	public String doGetCarSaled(Model model) {
	
		List<CarInfo> res = adminCarService.getCarSaled(); 
		  String json=JSONArray.toJSONString(res);
		  return json;
		
	}
	//后台查询所有订单
	@RequestMapping("/doGetOrderById")
	@ResponseBody
	public String  doGetCarOrder(@RequestParam(value="orderId",required=false)String orderId,@RequestParam(value="buyerId",required=false)String buyerId,@RequestParam(value="sellerId",required=false)String sellerId,
			@RequestParam(value="carId",required=false)String carId,@RequestParam(value="orderStatus",required=false)String orderStatus,Model model) {
		List<CarOrder> res = adminOrderService.getCarOrderById(orderId, buyerId, sellerId, carId, orderStatus); 
		  String json=JSONArray.toJSONString(res);
		  return json;
	}
	//后台查询被取消订单
	@RequestMapping("/doGetCarOrderCancelled")
	@ResponseBody
	public String doGetCarOrderCancelled(@RequestParam(value="orderId",required=false)String orderId,@RequestParam(value="buyerId",required=false)String buyerId,@RequestParam(value="sellerId",required=false)String sellerId,
			@RequestParam(value="carId",required=false)String carId,@RequestParam(value="orderStatus",required=false)String orderStatus,Model model) {
		List<CarOrder> res =adminOrderService.getCarOrderCancelled();
		 String json=JSONArray.toJSONString(res);
		  return json;
	}
	//后台查询未确认订单
	@RequestMapping("/doGetCarOrderUnconfirmed")
	@ResponseBody
	public String doGetCarOrderUnconfirmed(@RequestParam(value="orderId",required=false)String orderId,@RequestParam(value="buyerId",required=false)String buyerId,@RequestParam(value="sellerId",required=false)String sellerId,
			@RequestParam(value="carId",required=false)String carId,@RequestParam(value="orderStatus",required=false)String orderStatus,Model model) {
		List<CarOrder> res =adminOrderService.getCarOrderUnconfirmed();
		 String json=JSONArray.toJSONString(res);
		  return json;	
	}
	//后台查询已确认订单
	@RequestMapping("/doGetCarOrderConfirmed")
	@ResponseBody
	public String doGetCarOrConfirmed(@RequestParam(value="orderId",required=false)String orderId,@RequestParam(value="buyerId",required=false)String buyerId,@RequestParam(value="sellerId",required=false)String sellerId,
			@RequestParam(value="carId",required=false)String carId,@RequestParam(value="orderStatus",required=false)String orderStatus,Model model) {
		List<CarOrder> res =adminOrderService.getCarOrderConfirmed();
		 String json=JSONArray.toJSONString(res);
		  return json;	
	}
	//后台查询已完成订单
	@RequestMapping("/doGetCarOrderCompleted")
	@ResponseBody
	public String doGetCarOrderCompleted(@RequestParam(value="orderId",required=false)String orderId,@RequestParam(value="buyerId",required=false)String buyerId,@RequestParam(value="sellerId",required=false)String sellerId,
			@RequestParam(value="carId",required=false)String carId,@RequestParam(value="orderStatus",required=false)String orderStatus,Model model) {
		List<HistoryOrder> res =adminOrderService.getCarOrderCompleted();
		 String json=JSONArray.toJSONString(res);
		  return json;
	}
	//后台查询所有车辆图片
	@RequestMapping("/doGetCarPicById")
	@ResponseBody
	public String doGetCarPicById(@RequestParam(value="carId",required=false)String carId,@RequestParam(value="picType",required=false)String picType,Model model) {
		model.addAttribute("itemsList",adminPicService.getCarPic(carId,picType));
		List<Pic> res =adminPicService.getCarPic(carId,picType);
		
		 String json=JSONArray.toJSONString(res);
		  return json;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public AdminUserService getAdminUserService() {
		return adminUserService;
	}

	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}
	public AdminCarService getAdminCarService() {
		return adminCarService;
	}
	public void setAdminCarService(AdminCarService adminCarService) {
		this.adminCarService = adminCarService;
	}
	public AdminOrderService getAdminOrderService() {
		return adminOrderService;
	}
	public void setAdminOrderService(AdminOrderService adminOrderService) {
		this.adminOrderService = adminOrderService;
	}
	public AdminPicService getAdminPicService() {
		return adminPicService;
	}
	public void setAdminPicService(AdminPicService adminPicService) {
		this.adminPicService = adminPicService;
	}
}
