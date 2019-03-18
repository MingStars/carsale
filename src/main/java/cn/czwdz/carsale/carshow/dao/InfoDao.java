package cn.czwdz.carsale.carshow.dao;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarRecom;
import org.springframework.stereotype.Repository;


@Repository
public interface InfoDao {
	//根据Id 查询
	@Select("SELECT c.*,(SELECT p.pic_url FROM pic p WHERE p.car_id=c.car_id )pic_url FROM car_info c WHERE car_id=#{id}")
	@Results(id="CarInfoResult",value={@Result(id=true,property="carId",column="car_id"),
			  @Result(property="brand",column="brand"),
			  @Result(property="carName",column="car_name"),
			  @Result(property="confName",column="conf_name"),
			  @Result(property="level",column="level"),
			  @Result(property="engine",column="engine"),
			  @Result(property="gearBox",column="gearbox"),
			  @Result(property="bodyStructure",column="body_structure"),
			  @Result(property="size",column="size"),
			  @Result(property="maxImumSpeed",column="maximumspeed"),
			  @Result(property="cargoVolume",column="cargo_volume"),
			  @Result(property="carAge",column="car_age"),
			  @Result(property="carMileage",column="car_mileage"),
			  @Result(property="carDamage",column="car_damage"),
			  @Result(property="isEager",column="iseager"),
			  @Result(property="price",column="price"),
			  @Result(property="licenseAddress",column="license_address"),
			  @Result(property="address",column="address"),
			  @Result(property="isLocked",column="islocked"),
			  @Result(property="uId",column="uid"),
			  @Result(property="subDate",column="subdate"),
			  @Result(property="viewedTimes",column="viewedtimes"),
			  @Result(property="orderDate",column="orderdate"),
			  @Result(property="buyerId",column="buyer_id"),
              @Result(property="picUrl",column="pic_url")
	         })
//	public List<CarInfo> getInfo(@Param("id")Integer id);
	public CarInfo getInfo(@Param("id") Integer id);
	//查询品牌
	@Select("SELECT c.*,(SELECT p.pic_url FROM pic p WHERE p.car_id=c.car_id )pic_url FROM car_info c")
	@ResultMap("CarInfoResult")
	public List<CarInfo> getInfoBy();
	
	//查询商品根据推荐条件
		@Select("<script>"+
				"SELECT c.*,(SELECT p.pic_url FROM pic p WHERE p.car_id=c.car_id )pic_url FROM car_info c where car_name in "+
				"<foreach collection='array' index='index' item='item' open='(' separator=',' close=')'>#{item}</foreach>"+
				"limit 0,20"+
				"</script>"
				)
		@ResultMap("CarInfoResult")
		public List<CarInfo> getInfoByMangName(String[] item);
	
	
	 //动态查车系 品牌  价格
	@Select("<script>"+
			"select c.*,(SELECT p.pic_url FROM pic p WHERE p.car_id=c.car_id )pic_url FROM car_info c"+
			"<where>"+
			"<if test=\"brand!=null and brand!=''\">c.brand like '%${brand}%'</if>"+
			"<if test=\"name!=null and name!=''\">and c.car_name =#{name}</if>"+
			"<if test=\"num1!=null\">and c.price between  #{num1} and #{num2}</if>"+
//			"<if test=\"name!=null and name!=''\">and price like '%${like}%'</if>"+
			"</where>"+
			"limit #{pagenum1},#{pagenum2}"+
			"</script>"
			)
	@ResultMap("CarInfoResult")
	public List<CarInfo> getInfoBybrand(@Param("brand") String brand, @Param("name") String name,
                                        @Param("pagenum1") Integer pagenum1, @Param("pagenum2") Integer pagenum2,
                                        @Param("num1") Double num1, @Param("num2") Double num2);
	//模糊查询品牌
	@Select("SELECT DISTINCT brand,car_name FROM car_info WHERE brand LIKE '%${brand}%' ")
	@ResultMap("CarInfoResult")
	public List<CarInfo>  getInfoByName(@Param("brand") String brand);
	//查询分页影响行数
	@Select("<script>"+
			"select count(1) from car_info"+
			"<where>"+
			"<if test=\"brand!=null and brand!=''\">brand like '%${brand}%'</if>"+
			"<if test=\"name!=null and name!=''\">and car_name=#{name}</if>"+
			"<if test=\"num1!=null\">and price between #{num1} and #{num2}</if>"+
			"</where>"+
			"</script>"
			)
	public Integer getCountBybrand(@Param("brand") String brand, @Param("name") String name,
                                   @Param("num2") Double num2, @Param("num1") Double num1);
	
	//查询不限车系
	@Select("select * from car_recom_info")
	@Results(id="CarRecomResult",value={@Result(id=true,property="carId",column="car_id"),
			  @Result(property="carId",column="car_id"),
			  @Result(property="carName",column="car_name"),
			  @Result(property="brand",column="brand"),
			  })
	public List<CarRecom> getInfoByRecom();
	
	//增加出售汽车信息Info
		//我要卖车
		/*
		 * @Insert("insert into car_info(car_id,brand,car_name,engine,gearbox, " +
		 * " body_structure,size,maximumspeed,cargo_volume) values  " +
		 * " (#{carInfo.carId},#{carInfo.brand},#{carInfo.carName}, " +
		 * " #{carInfo.engine},#{carInfo.gearBox},#{carInfo.bodyStructure} " +
		 * " ,#{carInfo.size},#{carInfo.maxImumSpeed},#{carInfo.cargoVolume}) ") //
		 * public CarInfo addCarInfo(@Param("id")String id,@Param("brand")String
		 * brand,@Param("car_name")String car_name, // @Param("engine")String
		 * engine,@Param("gearbox")String gearbox, // @Param("body_structure")String
		 * body_structure,@Param("size")String size,@Param("maximumspeed")String
		 * maximumspeed, // @Param("cargo_volume")String cargo_volume); public Integer
		 * addCarInfo(@Param("carInfo")CarInfo carInfo);
		 */
		  @Insert("insert into car_info(car_id,brand,car_name,car_mileage,price,car_age, "
		  		+ " car_damage,address,license_address,iseager,islocked) values  " +
		  " (#{id},#{brand},#{carName}, " +
		  " #{carMileage},#{price},#{carAge} " +
		  " ,#{carDamage},#{address},#{licenseAddress},#{isEager},#{islocked}) ") //
		  public Integer addCarInfo(@Param("id") String id, @Param("brand") String
                  brand, @Param("carName") String carName, @Param("carMileage") Double carMileage, @Param("price") Double price,
                                    @Param("carAge") Double carAge, @Param("carDamage") String carDamage,
                                    @Param("address") String address, @Param("licenseAddress") String licenseAddress, @Param("isEager") String isEager, @Param("islocked") String islocked);
	
	
	
	
	
	/*
	 * //增加出售汽车信息Info
	 * 
	 * @Insert("insert into car_info(car_id,brand,car_name,engine,gearbox, " +
	 * " body_structure,size,maximumspeed,cargo_volume) values  " +
	 * " (#{carInfo.carId},#{carInfo.brand},#{carInfo.carName}, " +
	 * " #{carInfo.engine},#{carInfo.gearBox},#{carInfo.bodyStructure} " +
	 * " ,#{carInfo.size},#{carInfo.maxImumSpeed},#{carInfo.cargoVolume}) ") //
	 * public CarInfo addCarInfo(@Param("id")String id,@Param("brand")String
	 * brand,@Param("car_name")String car_name, // @Param("engine")String
	 * engine,@Param("gearbox")String gearbox, // @Param("body_structure")String
	 * body_structure,@Param("size")String size,@Param("maximumspeed")String
	 * maximumspeed, // @Param("cargo_volume")String cargo_volume); public Integer
	 * addCarInfo(@Param("carInfo")CarInfo carInfo); //增加底盘及制动信息
	 * 
	 * @Insert("  insert into car_chassis_brake_info(car_id,drive_mode,auto_power_type,front_suspension_type, "
	 * +
	 * "rear_suspension_type,front_brake_type,rear_brake_type,parking_brake_type, "
	 * + " front_wheel_size,rear_wheel_size) values  " +
	 * " (#{carChassis.carId},#{carChassis.driveMode},#{carChassis.autoPowerType}, "
	 * + " #{carChassis.frontSuspensionType},#{carChassis.rearSuspensionType}, " +
	 * " #{carChassis.frontBrakeType},#{carChassis.rearBrakeType}, " +
	 * " #{carChassis.parkingBrakeType},#{carChassis.frontWheelSize}," +
	 * " #{carChassis.rearWheelSize}) ") // public CarChassis
	 * addCarChassis(@Param("id")String id,@Param("drive_mode")String
	 * drive_mode,@Param("auto_power_type")String auto_power_type //
	 * ,@Param("front_suspension_type")String
	 * front_suspension_type,@Param("rear_suspension_type")String
	 * rear_suspension_type // ,@Param("front_brake_type")String
	 * front_brake_type,@Param("rear_brake_type")String rear_brake_type //
	 * ,@Param("parking_brake_type")String
	 * parking_brake_type,@Param("front_wheel_size")String front_wheel_size //
	 * ,@Param("rear_wheel_size")String rear_wheel_size); public Integer
	 * addCarChassis(@Param("carChassis")CarChassis carChassis); //增加发动机参数信息
	 * 
	 * @Insert("insert into car_engine_info(car_id,displacement,intake_form,cylinder_arrangement, "
	 * + "cylinders,maximum_horsepower,fuel,fuel_label, " +
	 * " oilsupply_mode,enviroment_standard) values  " +
	 * " (#{carEngine.carId},#{carEngine.displacement},#{carEngine.intakeForm}, " +
	 * " #{carEngine.cylinderArrangement},#{carEngine.cylinders}, " +
	 * " #{carEngine.maximumHorsepower},#{carEngine.fuel}, " +
	 * " #{carEngine.fuelLabel},#{carEngine.oilsupplyMode}," +
	 * " #{carEngine.enviromentStandard} )")
	 * 
	 * // public CarEngine addCarEngine(@Param("id")String
	 * id,@Param("displacement")Double displacement,@Param("intake_form")String
	 * intake_form // ,@Param("cylinder_arrangement")String
	 * cylinder_arrangement,@Param("cylinders")String cylinders //
	 * ,@Param("maximum_horsepower")String maximum_horsepower,@Param("fuel")String
	 * fuel // ,@Param("fuel_label")String fuel_label,@Param("oilsupply_mode")String
	 * oilsupply_mode // ,@Param("enviroment_standard")String enviroment_standard);
	 * public Integer addCarEngine(@Param("carEngine")CarEngine carEngine);
	 * //增加外部配置信息
	 * 
	 * @Insert("insert into car_external_info(car_id,electronic_sunroof,panoramic_sunroof,electronic_door_pull, "
	 * + "electronic_trunk,rain_sensing_wipers,rear_wiper,power_window, " +
	 * " electronic_rearview_mirror,rearview_mirror_heating) values  " +
	 * " (#{carExternal.carId},#{carExternal.electronicSunroof},#{carExternal.panoramicSunroof}, "
	 * + " #{carExternal.electronicDoorPull},#{carExternal.electronicTrunk}, " +
	 * " #{carExternal.rainSensingWipers},#{carExternal.rearWiper}, " +
	 * " #{carExternal.powerWindow},#{carExternal.electronicRearviewMirror}," +
	 * " #{carExternal.rearviewMirrorHeating} )") // public CarExternal
	 * addCarExternal(@Param("id")String id,@Param("electronic_sunroof")String
	 * electronic_sunroof,@Param("panoramic_sunroof")String panoramic_sunroof //
	 * ,@Param("electronic_door_pull")String
	 * electronic_door_pull,@Param("electronic_trunk")String electronic_trunk //
	 * ,@Param("rain_sensing_wipers")String
	 * rain_sensing_wipers,@Param("rear_wiper")String rear_wiper //
	 * ,@Param("power_window")String
	 * power_window,@Param("electronic_rearview_mirror")String
	 * electronic_rearview_mirror // ,@Param("rearview_mirror_heating")String
	 * rearview_mirror_heating); public Integer
	 * addCarExternal(@Param("carExternal")CarExternal carExternal); //增加内部配置
	 * 
	 * @Insert("insert into car_internal_info(car_id,mf_steering_wheel,dlcc,automatic_air_con, "
	 * + " manual_air_con,gps,parking_redar,reverse_video, " +
	 * " leather_seat,seat_heating) values  " +
	 * " (#{carInternal.carId},#{carInternal.mfSteeringWheel},#{carInternal.dlcc}, "
	 * + " #{carInternal.automaticAirCon},#{carInternal.manualAirCon}, " +
	 * " #{carInternal.gps},#{carInternal.parkingRedar}, " +
	 * " #{carInternal.reverseVideo},#{carInternal.leatherSeat}," +
	 * " #{carInternal.seatHeating} )") // public CarInternal
	 * addCarInternal(@Param("id")String id,@Param("mf_steering_wheel")String
	 * mf_steering_wheel,@Param("dlcc")String dlcc //
	 * ,@Param("automatic_air_con")String
	 * automatic_air_con,@Param("manual_air_con")String manual_air_con //
	 * ,@Param("gps")String gps,@Param("parking_redar")String parking_redar //
	 * ,@Param("reverse_video")String reverse_video,@Param("leather_seat")String
	 * leather_seat // ,@Param("seat_heating")String seat_heating); public Integer
	 * addCarInternal(@Param("carInternal")CarInternal carInternal); //增加安全配置信息
	 * 
	 * @Insert("insert into car_safety_info(car_id,front_airbag,head_airbag,child_seat_int,"
	 * + "tpms,car_lock,abs,usc," + " pss) values  " +
	 * " (#{carSafety.carId},#{carSafety.frontAirbag},#{carSafety.headAirbag}," +
	 * " #{carSafety.childSeatInt},#{carSafety.tpms}, " +
	 * " #{carSafety.carLock},#{carSafety.abs}," +
	 * " #{carSafety.usc},#{carSafety.pss} )") // public CarSafety
	 * addCarSafety(@Param("id")String id,@Param("front_airbag")String
	 * front_airbag,@Param("head_airbag")String head_airbag //
	 * ,@Param("child_seat_int")String child_seat_int,@Param("tpms")String tpms //
	 * ,@Param("car_lock")String car_lock,@Param("abs")String abs //
	 * ,@Param("usc")String usc,@Param("pss")String pss); public Integer
	 * addCarSafety(@Param("carSafety")CarSafety carSafety);
	 */
	
	
	@Select("SELECT MAX(car_id) FROM car_info")
	public Integer getMaxnum();


	
}
