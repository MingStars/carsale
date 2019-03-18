package cn.czwdz.carsale.user.service;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.Fav;
import org.apache.ibatis.annotations.Param;





public interface FavService {
	public List<Fav> collection();
	
	public int deleteCollection(@Param("carId") String carId);
	
	public int addCollection(@Param("carId") String carId, @Param("uId") String uId);
}
