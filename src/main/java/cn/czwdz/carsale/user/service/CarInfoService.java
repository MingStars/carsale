package cn.czwdz.carsale.user.service;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.CarInfo;
import org.apache.ibatis.annotations.Param;





public interface CarInfoService {
	public CarInfo help(String carId);

	public List<CarInfo> faBuCarCollection();
	
	public List<CarInfo> buyerHistory();
	
	public List<CarInfo> likefind(@Param("carId") String carId, @Param("carName") String carName, @Param("confName") String confName, @Param("sc") Integer i);

	public List<String> carnames();

	public int UpdateCarById(@Param("confName") String confName, @Param("price") Double price, @Param("carAge") Double carAge, @Param("carId") String carId);
}
