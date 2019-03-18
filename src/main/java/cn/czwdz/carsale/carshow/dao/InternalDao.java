package cn.czwdz.carsale.carshow.dao;



import cn.czwdz.carsale.manager.pojo.CarInternal;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface InternalDao {
	
	@Select("select * from car_internal_info where car_id = #{id }")
	@Results(value={
			@Result(id=true,property="carId",column="car_id"),
			@Result(property="mfSteeringWheel",column="mf_steering_wheel"),
			@Result(property="dlcc",column="dlcc"),
			@Result(property="automaticAirCon",column="automatic_air_con"),
			@Result(property="manualAirCon",column="manual_air_con"),
			@Result(property="gps",column="gps"),
			@Result(property="parkingRedar",column="parking_redar"),
			@Result(property="reverseVideo",column="reverse_video"),
			@Result(property="leatherSeat",column="leather_seat"),
			@Result(property="seatHeating",column="seat_heating")
	})
	//	public List<CarInternal> getInternal(@Param("id")Integer id);
	public CarInternal getInternal(@Param("id") Integer id);

}
