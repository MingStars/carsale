package cn.czwdz.carsale.carshow.controller;



import java.util.*;


import cn.czwdz.carsale.carshow.service.*;
import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarRecom;
import cn.czwdz.carsale.manager.service.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class CarshowController {
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





	//车辆详细信息
	@RequestMapping("/getCarShow")
	public String getCarShow(Model model,Integer id,String userId){
//		List<CarChassis> list1 = chassis.getChassis(id);
//		List<CarEngine> list2 = engine.getEngine(id);
//		List<CarExternal> list3 = external.getExternal(id);
//		List<CarInfo> list4 = info.getInfo(id);
//		List<CarInternal> list5 = internal.getInternal(id);
//		List<CarSafety> list6 = safety.getSafety(id);
        System.out.println(id.toString()+"=========="+userId);

		if(redisUtils.hHasKey(userId,id+"")){
			redisUtils.hincr(userId,id+"",1);
		}
		redisUtils.hset(userId,id+"", "1");

		model.addAttribute("carChassisBrakeInfo",chassis.getChassis(id));
		model.addAttribute("carEngineInfo",engine.getEngine(id));
		model.addAttribute("carExternalInfo",external.getExternal(id));
		model.addAttribute("carInfo",info.getInfo(id));
		model.addAttribute("carInternalInfo",internal.getInternal(id));
		model.addAttribute("carSafetyInfo",safety.getSafety(id));
		model.addAttribute("userId",userId);
//		System.out.println(chassis.getChassis(id).getAuto_power_type()+"1111");
//		System.out.println(list1+"11111");
		if(true){

		}

		return "car/details0";
	}
//	//我要卖车
	@RequestMapping("/showCar")
	public String getCarShow2(Model model,Integer id){
////		id = 10568;
////		List<CarChassis> list1 = chassis.getChassis(id);
////		List<CarEngine> list2 = engine.getEngine(id);
////		List<CarExternal> list3 = external.getExternal(id);
////		List<CarInfo> list4 = info.getInfo(id);
////		List<CarInternal> list5 = internal.getInternal(id);
////		List<CarSafety> list6 = safety.getSafety(id);
//	    model.addAttribute("carChassisBrakeInfo",chassis.getChassis(id));
//	    model.addAttribute("carEngineInfo",engine.getEngine(id));
//		model.addAttribute("carExternalInfo",external.getExternal(id));
//		model.addAttribute("carInfo",info.getInfo(id));
//		model.addAttribute("carInternalInfo",internal.getInternal(id));
//		model.addAttribute("carSafetyInfo",safety.getSafety(id));
////		System.out.println(chassis.getChassis(id).getAuto_power_type()+"1111");
////		System.out.println(list1+"11111");
		return "car/showCar";
	}

	//添加收藏(添加至Redis)
	@RequestMapping("/addFavCar")
	@ResponseBody
	public String addFavCar(Model model,Integer id,String userId){
         String str = id.toString();
		if(redisUtils.hHasKey(userId+"Fav",str)){
			return "您已经收藏过了";
		}
		redisUtils.hset(userId+"Fav",str,"1");
		return "已收藏";
	}
	
	
	
	
	//我要买车
	@RequestMapping("/carHome")
	public String getCarshow3(Model model,String userid){
		List<CarRecom> lis = info.getInfoByRecom();
		model.addAttribute("list2",lis);
		
		//页面得到数组返回
		String[]item = {"撼路者","高尔夫GTI","朗逸","翼神","A4L"};
		List<CarInfo> list = info.getInfoByMangName(item);
		Collections.shuffle(list);
		Map<Object,Object> maps=redisUtils.hmget(userid);
		//获取map中的key的集合
		Set<Object> keys=maps.keySet();




        model.addAttribute("keys",keys);
		model.addAttribute("count",20);
		model.addAttribute("pageCount", 2);
		model.addAttribute("list",list);
		model.addAttribute("current",1);

		return "car/home";
	}
//	//模糊查询品牌
//	@RequestMapping(value="/likeBrand",produces={"application/json;charset=utf-8"})
//	@ResponseBody
//	public List<CarInfo> getCarshowLink(Model model,@RequestParam(value="brand",required=false)String brand,@RequestParam(value="name",required=false)String name) {
////		System.out.println(brand+"111");
////		List<CarInfo> str = info.geandtInfoBybrand(brand,name);
////		model.addAttribute("list",str);
//		
////		List<CarInfo> list = info.getInfoByName(brand);
////		model.addAttribute("list2",list);
//		
//		return info.geandtInfoBybrand(brand,name);
//	}
	
	@RequestMapping("/linkBrand")
	public String getCarshowLink(Model model,@RequestParam(value="brand",required=false,defaultValue="")String brand,@RequestParam(value="name",required=false,defaultValue="" )String name,@RequestParam(value="current",required=true,defaultValue="1" )Integer current,@RequestParam(value="num2",required=false,defaultValue="")Double num2,@RequestParam
			                    (value="num1",required=false,defaultValue="")Double num1,@RequestParam(value = "userId",required=false,defaultValue="")String userId) {
		Integer count = info.getCountBybrand(brand, name,num2,num1);
		Integer pageCount=0;
		if(count==0) {
			pageCount=1;
		}else {
		
		if(count%20==0) {
			pageCount = count/20;
		}else if(count%20>0) {
			pageCount = count/20+1;
		}
		}
		
		if(current<=0) {
			current=1;
		}else if(current>pageCount){
			current=pageCount;
		}
//		System.out.println(count+"333333");
//		System.out.println(pageCount+"444444");
//		System.out.println(num2+"111");
//		System.out.println(num1+"111");
		/*
		 * if(current<=0) { current=1; }else if(current>=pageCount) { current=pageCount;
		 * }
		 */
		List<CarInfo> str = info.getInfoBybrand(brand,name,current,20, num1, num2);
//		System.out.println(num1+"222");
//		System.out.println(num2+"222");
		Map<Object,Object> maps=redisUtils.hmget(userId);
		//获取map中的key的集合
		Set<Object> keys=maps.keySet();

		model.addAttribute("keys",keys);
		model.addAttribute("count",count);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("brand", brand);
		model.addAttribute("name", name);
		model.addAttribute("list",str);
		model.addAttribute("current",current);
		model.addAttribute("num2",num2);
		model.addAttribute("num1",num1);
		List<CarInfo> list = info.getInfoByName(brand);
		model.addAttribute("list2",list);
		
		return "car/home";
	}
	@RequestMapping("/showCar2")
	public String addShowCar(Model model,@RequestParam("carId")String carId,@RequestParam("carName")String carName,@RequestParam("carMileage")Double carMileage,
			@RequestParam("price")Double price,@RequestParam("carAge")Double carAge,@RequestParam("carDamage")String carDamage,@RequestParam("address")String address,
			@RequestParam("licenseAddress")String licenseAddress,@RequestParam("isEager")String isEager,@RequestParam("brand")String brand,@RequestParam("isLocked")String isLocked) {


		model.addAttribute("carInfo",info.addCarInfo(carId,brand,carName,carMileage,price,carAge,carDamage,address,licenseAddress,isEager,isLocked));
	
		return "car/home";
		
		
		
	}
	
}
	
	


