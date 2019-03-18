package cn.czwdz.carsale.carshow.dao;


import cn.czwdz.carsale.manager.pojo.CarChassis;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface ChassisDao {
	
	@Select("select * from car_chassis_brake_info where car_id=#{id}")
	@Results(value={
			@Result(id=true,property="carId",column="car_id"),
			@Result(property="driveMode",column="drive_mode"),
			@Result(property="autoPowerType",column="drive_mode"),
			@Result(property="frontSuspensionType",column="front_suspension_type"),
			@Result(property="rearSuspensionType",column="rear_suspension_type"),
			@Result(property="frontBrakeType",column="front_brake_type"),
			@Result(property="rearBrakeType",column="rear_brake_type"),
			@Result(property="parkingBrakeType",column="parking_brake_type"),
			@Result(property="frontWheelSize",column="front_wheel_size"),
			@Result(property="rearWheelSize",column="rear_wheel_size"),	
	})
//	public List<CarChassis> getChassis(@Param("id")Integer id);
	public CarChassis getChassis(@Param("id") Integer id);

}
