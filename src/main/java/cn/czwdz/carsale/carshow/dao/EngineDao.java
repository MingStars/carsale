package cn.czwdz.carsale.carshow.dao;



import cn.czwdz.carsale.manager.pojo.CarEngine;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface EngineDao {
	@Results(value= {
			@Result(id=true,property="carId",column="car_id"),
			@Result(property="displacement",column="displacement"),
			@Result(property="intakeForm",column="intake_form"),
			@Result(property="cylinderArrangement",column="cylinder_arrangement"),
			@Result(property="cylinders",column="cylinders"),
			@Result(property="maximumHorsepower",column="maximum_horsepower"),
			@Result(property="fuel",column="fuel"),
			@Result(property="fuelLabel",column="fuel_label"),
			@Result(property="oilsupplyMode",column="oilsupply_mode"),
			@Result(property="enviromentStandard",column="enviroment_standard")
			
	})
	@Select("select * from car_engine_info where car_id=#{id}")
//	public List<CarEngine> getEngineDao(@Param("id")Integer id);
	public CarEngine getEngineDao(@Param("id") Integer id);

}
