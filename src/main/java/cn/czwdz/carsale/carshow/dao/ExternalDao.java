package cn.czwdz.carsale.carshow.dao;


import cn.czwdz.carsale.manager.pojo.CarExternal;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface ExternalDao {
	
	@Select("select * from car_external_info where car_id=#{id}")
	@Results(value={
			@Result(id=true,property="carId",column="car_id"),
			@Result(property="electronicSunroof",column="electronic_sunroof"),
			@Result(property="panoramicSunroof",column="panoramic_sunroof"),
			@Result(property="electronicDoorPull",column="electronic_door_pull"),
			@Result(property="electronicTrunk",column="electronic_trunk"),
			@Result(property="rainSensingWipers",column="rain_sensing_wipers"),
			@Result(property="rearWiper",column="rear_wiper"),
			@Result(property="powerWindow",column="power_window"),
			@Result(property="electronicRearviewMirror",column="electronic_rearview_mirror"),
			@Result(property="rearviewMirrorHeating",column="rearview_mirror_heating")
	})
	public CarExternal getExternal(@Param("id") Integer id);

}
