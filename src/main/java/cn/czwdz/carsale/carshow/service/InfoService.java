package cn.czwdz.carsale.carshow.service;



import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarRecom;

import java.util.List;





public interface InfoService {
	
//	public List<CarInfo> getInfo(Integer id);
	public CarInfo getInfo(Integer id);
	
	public List<CarInfo> getInfoBy();
	
	public List<CarInfo> getInfoBybrand(String brand, String name, Integer pagenum1, Integer pagenum2, Double num2, Double num1);
	
	public Integer getCountBybrand(String brand, String name, Double num1, Double num2);
	
	public List<CarInfo>  getInfoByName(String brand);
	
	public List<CarRecom> getInfoByRecom();
	
	public List<CarInfo> getInfoByMangName(String[] item);
	
	 public Integer addCarInfo(String id, String brand, String carName, Double carMileage, Double price,
                               Double carAge, String carDamage,
                               String address, String licenseAddress, String isEager, String islocked);
	
	
//	public CarInfo addCarInfo(String id,String brand,String car_name,String engine,String gearbox,String body_structure,
//	                          String size,String maximumspeed,String cargo_volume);
	/* public Integer addCarInfo(CarInfo carInfo); */

//	public CarChassis addCarChassis(String id,String drive_mode,String auto_power_type
//			,String front_suspension_type,String rear_suspension_type
//			,String front_brake_type,String rear_brake_type
//			,String parking_brake_type,String front_wheel_size
//			,String rear_wheel_size);
	
	
	/*
	 * public Integer addCarChassis(CarChassis carChassis);
	 * 
	 * 
	 * // public CarEngine addCarEngine(String id,Double displacement,String
	 * intake_form // ,String cylinder_arrangement,String cylinders // ,String
	 * maximum_horsepower,String fuel // ,String fuel_label,String oilsupply_mode //
	 * ,String enviroment_standard);
	 * 
	 * public Integer addCarEngine(CarEngine carEngine); // // public CarExternal
	 * addCarExternal(String id,String electronic_sunroof,String panoramic_sunroof
	 * // ,String electronic_door_pull,String electronic_trunk // ,String
	 * rain_sensing_wipers,String rear_wiper // ,String power_window,String
	 * electronic_rearview_mirror // ,String rearview_mirror_heating);
	 * 
	 * public Integer addCarExternal(CarExternal carExternal);
	 * 
	 * // public CarInternal addCarInternal(String id,String
	 * mf_steering_wheel,String dlcc // ,String automatic_air_con,String
	 * manual_air_con // ,String gps,String parking_redar // ,String
	 * reverse_video,String leather_seat // ,String seat_heating);
	 * 
	 * public Integer addCarInternal(CarInternal carInternal); // // public
	 * CarSafety addCarSafety(String id,String front_airbag,String head_airbag //
	 * ,String child_seat_int,String tpms // ,String car_lock,String abs // ,String
	 * usc,String pss);
	 * 
	 * public Integer addCarSafety(CarSafety carSafety);
	 */

}
