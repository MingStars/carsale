package cn.czwdz.carsale.user.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.Fav;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;


@Repository
public interface FavDao {
	
	@Select("select * from fav")
	@Results({
	
		@Result(column="uid",property="id"),
		@Result(column="car_id",property="carId"),
	
	@Result(column="uid",property="user",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",fetchType=FetchType.EAGER)),
		
	@Result(column="car_id",property="carInfo",one=@One(select="cn.czwdz.carsale.user.dao.CarInfoDao.help",fetchType=FetchType.EAGER))
	})
	public List<Fav> collection();
	
	@Delete("DELETE FROM fav WHERE car_id=#{carId}")
	@Results({
		@Result(column="car_id",property="carId")
	})
	public int deleteCollection(@Param("carId") String carId);
	
	@Insert("INSERT INTO fav (uid,car_id) VALUES(#{uId},#{carId})")
	@Results({
	
		@Result(column="uid",property="id"),
		@Result(column="car_id",property="carId")
	})
	public int addCollection(@Param("carId") String carId, @Param("uId") String uId);
}
