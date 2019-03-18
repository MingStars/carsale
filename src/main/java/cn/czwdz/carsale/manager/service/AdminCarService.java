package cn.czwdz.carsale.manager.service;

import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarOrder;

import java.util.List;



public interface AdminCarService {

	public List<CarInfo> getCarInfo(String carId, String sellerId, String isLocked);


	public List<CarInfo> getCarAudite();
	
	public List<CarOrder> getCarBooked();
	
	public List<CarInfo> getCarSalable();
	
	public List<CarInfo> getCarSaled();

}
