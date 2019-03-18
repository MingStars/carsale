package cn.czwdz.carsale.manager.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminCarDao {

	@Select("<script>"+
			"SELECT car_id, brand,car_name,car_age,conf_name,price,iseager,islocked,uid FROM `car_info`"+
			"<where>" +
            "<if test=\"carId != null and carId!=''\"> car_id = #{carId}"+
            "</if><if test=\"sellerId != null and sellerId!= ''\">and uid = #{sellerId}"+
            "</if><if test=\"isLocked != null and isLocked != '' \">and isLocked = #{isLocked}</if></where> "+
            "</script>")
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
			  @Result(property="buyerId",column="buyer_id")

	         })
	
	public List<CarInfo> getCarInfo(@Param("carId") String carId, @Param("sellerId") String sellerId, @Param("isLocked") String isLocked);
	
	@Select("SELECT car_id,uid,subdate,islocked FROM `car_info`  WHERE islocked='待审核'")
	@ResultMap("CarInfoResult")
	public List<CarInfo> getCarAudite();
	
	@Select("SELECT car_id,seller_id,buyer_id,order_time FROM `car_order` WHERE order_status='未确认'")
	@Results(id="CarOrderResult",value={@Result(id=true,property="orderId",column="order_id"),
		@Result(property="carId",column="car_id"),
		@Result(property="baseinfo",column="baseinfo"),	
		@Result(property="carPrice",column="car_price"),	
		@Result(property="deposit",column="deposit"),	
		@Result(property="sellerId",column="seller_id"),	
		@Result(property="address",column="address"),	
		@Result(property="buyerId",column="buyer_id"),	
		@Result(property="orderTime",column="order_time"),
		@Result(property="orderStatus",column="order_status")
	})
	public List<CarOrder> getCarBooked();
	
	@Select("SELECT car_id,brand,car_name,price,address,uid,viewedtimes FROM `car_info`  WHERE islocked='可出售'")
	@ResultMap("CarInfoResult")
	public List<CarInfo> getCarSalable();
	@Select("SELECT c.car_id,(SELECT h.buyer_id FROM `history_order` h WHERE c.car_id=h.`car_id`)buyer_id,c.uid FROM `car_info` c  WHERE islocked='已售出'")
	@ResultMap("CarInfoResult")
	/*
	 * @Results(value= {
	 * 
	 * @Result(id=true,property="historyId",column="history_id"),
	 * 
	 * @Result(property="buyerId",column="buyer_id"),
	 * 
	 * @Result(property="carId",column="car_id"),
	 * 
	 * @Result(property="sellerId",column="seller_id") })
	 */
	public List<CarInfo> getCarSaled();
}
