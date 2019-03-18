package cn.czwdz.carsale.user.service;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import org.apache.ibatis.annotations.Param;





public interface HistoryOrderService {
	public List<HistoryOrder> sellCar();
	
	public List<HistoryOrder> buyCar();
	
	
	public HistoryOrder buyCarById(@Param("carId") String carId);

	public HistoryOrder sellCarById(@Param("carId") String carId);
}
