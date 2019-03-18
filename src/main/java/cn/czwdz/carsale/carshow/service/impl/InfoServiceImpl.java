package cn.czwdz.carsale.carshow.service.impl;



import java.util.List;

import cn.czwdz.carsale.carshow.dao.InfoDao;
import cn.czwdz.carsale.carshow.service.InfoService;
import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarRecom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
	@Autowired
	private InfoDao infoDao;

	public InfoDao getInfoDao() {
		return infoDao;
	}

	public void setInfoDao(InfoDao infoDao) {
		this.infoDao = infoDao;
	}

	public CarInfo getInfo(Integer id) {
		// TODO Auto-generated method stub
		return infoDao.getInfo(id);
	}

	public List<CarInfo> getInfoBy() {

		return infoDao.getInfoBy();
	}

	public List<CarInfo> getInfoBybrand(String brand,String name,Integer current,Integer linesize,Double num1,Double num2) {
//		System.out.println(brand+"22");
		Integer pagenum1 = (current-1)*linesize;
		Integer pagenum2 = linesize;
		return infoDao.getInfoBybrand(brand,name, pagenum1, pagenum2,num1,num2);
	}

	public List<CarInfo> getInfoByName(String brand) {

		return infoDao.getInfoByName(brand);
	}

	public List<CarRecom> getInfoByRecom() {
		
		return infoDao.getInfoByRecom();
	}

	public Integer getCountBybrand(String brand, String name,Double num1,Double num2) {
		// TODO Auto-generated method stub
		return infoDao.getCountBybrand(brand, name,num1,num2);
	}

	/*
	 * @Override public Integer addCarInfo(CarInfo carInfo) {
	 * System.out.println(carInfo); carInfo.setCarId((infoDao.getMaxnum()+1)+"");
	 * System.out.println(carInfo.getCarId());
	 * System.out.println(carInfo.getCarName());
	 * System.out.println(carInfo.getLevel());
	 * System.out.println(carInfo.getEngine()); return infoDao.addCarInfo(carInfo);
	 * }
	 * 
	 * @Override public Integer addCarChassis(CarChassis carChassis) {
	 * carChassis.setCarId(infoDao.getMaxnum()+"");
	 * System.out.println(carChassis.getCarId()+"yyy"); return
	 * infoDao.addCarChassis(carChassis); }
	 * 
	 * @Override public Integer addCarEngine(CarEngine carEngine) {
	 * carEngine.setCarId(infoDao.getMaxnum()+""); return
	 * infoDao.addCarEngine(carEngine); }
	 * 
	 * @Override public Integer addCarExternal(CarExternal carExternal) {
	 * carExternal.setCarId(infoDao.getMaxnum()+""); return
	 * infoDao.addCarExternal(carExternal); }
	 * 
	 * @Override public Integer addCarInternal(CarInternal carInternal) {
	 * carInternal.setCarId(infoDao.getMaxnum()+""); return
	 * infoDao.addCarInternal(carInternal); }
	 * 
	 * @Override public Integer addCarSafety(CarSafety carSafety) {
	 * carSafety.setCarId(infoDao.getMaxnum()+""); return
	 * infoDao.addCarSafety(carSafety); }
	 */
	
	public Integer addCarInfo(String id, String brand, String carName, Double carMileage, Double price, Double carAge,
			String carDamage, String address, String licenseAddress, String isEager,String isLocked) {
		id=(infoDao.getMaxnum()+1)+"";
		return infoDao.addCarInfo(id, brand, carName, carMileage, price, carAge, carDamage, address, licenseAddress,isEager, isLocked);
	}

	@Override
	public List<CarInfo> getInfoByMangName(String[] item) {
		// TODO Auto-generated method stub
		return infoDao.getInfoByMangName(item);
	}

//	@Override
//	public CarInfo addCarInfo(String id, String brand, String car_name, String engine, String gearbox,
//			String body_structure, String size, String maximumspeed, String cargo_volume) {
//		 id = (infoDao.getMaxnum()+1)+"";
//		 System.out.println(brand+"YYYYY");
//
//		return infoDao.addCarInfo(id, brand, car_name, engine, gearbox, body_structure, size, maximumspeed, cargo_volume);
//	}
//
//	@Override
//	public CarChassis addCarChassis(String id, String drive_mode, String auto_power_type,
//			String front_suspension_type, String rear_suspension_type, String front_brake_type, String rear_brake_type,
//			String parking_brake_type, String front_wheel_size, String rear_wheel_size) {
//		    id = (infoDao.getMaxnum()+1)+"";
//		return infoDao.addCarChassis(id, drive_mode, auto_power_type, front_suspension_type, rear_suspension_type, front_brake_type, rear_brake_type, parking_brake_type, front_wheel_size, rear_wheel_size);
//	}
//
//	@Override
//	public CarEngine addCarEngine(String id, Double displacement, String intake_form, String cylinder_arrangement,
//			String cylinders, String maximum_horsepower, String fuel, String fuel_label, String oilsupply_mode,
//			String enviroment_standard) {
//		 id = (infoDao.getMaxnum()+1)+"";
//		return infoDao.addCarEngine(id, displacement, intake_form, cylinder_arrangement, cylinders, maximum_horsepower, fuel, fuel_label, oilsupply_mode, enviroment_standard);
//	}
//
//	@Override
//	public CarExternal addCarExternal(String id, String electronic_sunroof, String panoramic_sunroof,
//			String electronic_door_pull, String electronic_trunk, String rain_sensing_wipers, String rear_wiper,
//			String power_window, String electronic_rearview_mirror, String rearview_mirror_heating) {
//		 id = (infoDao.getMaxnum()+1)+"";
//		return infoDao.addCarExternal(id, electronic_sunroof, panoramic_sunroof, electronic_door_pull, electronic_trunk, rain_sensing_wipers, rear_wiper, power_window, electronic_rearview_mirror, rearview_mirror_heating);
//	}
//
//	@Override
//	public CarInternal addCarInternal(String id, String mf_steering_wheel, String dlcc, String automatic_air_con,
//			String manual_air_con, String gps, String parking_redar, String reverse_video, String leather_seat,
//			String seat_heating) {
//		 id = (infoDao.getMaxnum()+1)+"";
//		return infoDao.addCarInternal(id, mf_steering_wheel, dlcc, automatic_air_con, manual_air_con, gps, parking_redar, reverse_video, leather_seat, seat_heating);
//	}
//
//	@Override
//	public CarSafety addCarSafety(String id, String front_airbag, String head_airbag, String child_seat_int,
//			String tpms, String car_lock, String abs, String usc, String pss) {
//		 id = (infoDao.getMaxnum()+1)+"";
//		return infoDao.addCarSafety(id, front_airbag, head_airbag, child_seat_int, tpms, car_lock, abs, usc, pss);
//	}

//	@Override
//	public List<CarInfo> getInfo(Integer id) {
//		
//		return infoDao.getInfo(id);
//	}

	

}
