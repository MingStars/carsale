package cn.czwdz.carsale.carshow.dao;


import cn.czwdz.carsale.manager.pojo.CarSafety;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface SafetyDao {
	
	@Select("select * from car_safety_info where car_id=#{id}")
	@Results(value={
			@Result(id=true,property="carId",column="car_id"),
			@Result(property="frontAirbag",column="front_airbag"),
			@Result(property="headAirbag",column="head_airbag"),
			@Result(property="childSeatInt",column="child_seat_int"),
			@Result(property="tpms",column="tpms"),
			@Result(property="carLock",column="car_lock"),
			@Result(property="abs",column="abs"),
			@Result(property="usc",column="usc"),
			@Result(property="pss",column="pss")
	})
//	public List<CarSafety> getSafety(@Param("id")Integer id);
	public CarSafety getSafety(@Param("id") Integer id);

}
