package cn.czwdz.carsale.manager.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.CarOrder;
import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminOrderDao {
    
    @Results(id="getCarOrderResult",value= {
    		@Result(id=true,property="orderId",column="order_id"),
    		@Result(property="carId",column="car_id"),
    		@Result(property="baseinfo",column="baseinfo"),
    		@Result(property="carPrice",column="car_price"),
    		@Result(property="deposit",column="deposit"),
    		@Result(property="sellerId",column="seller_id"),
    		@Result(property="address",column="address"),
    		@Result(property="buyerId",column="buyer_id"),
    		@Result(property="orderTime",column="order_time"),
    		@Result(property="orderStatus",column="order_status"),
    		@Result(property="orderReason",column="order_reason")
    })
	@Select("<script>"+
			"SELECT order_id,buyer_id,car_id,seller_id,order_status FROM `car_order` "+
			"<where>" +
            "<if test=\"orderId != null and orderId!=''\"> order_id = #{orderId}"+
            "</if><if test=\"buyerId != null and buyerId!='' \">and buyer_id = #{buyerId}"+
            "</if><if test=\"sellerId != null and sellerId!='' \">and seller_id = #{sellerId}"+
            "</if><if test=\"carId != null and carId!='' \">and car_id = #{carId}"+
            "</if><if test=\"orderStatus != null and orderStatus!=''\">and order_status = #{orderStatus}</if></where> "+
            "</script>")
	public List<CarOrder> getCarOrderById(@Param("orderId") String orderId, @Param("buyerId") String buyerId, @Param("sellerId") String sellerId, @Param("carId") String carId, @Param("orderStatus") String orderStatus);
	
	
	@Select("SELECT order_id,car_id,seller_id,buyer_id,order_time,order_reason FROM `car_order` WHERE order_status = '已取消'")
	@ResultMap("getCarOrderResult")
	public List<CarOrder> getCarOrderCancelled();
	
	@Select("SELECT * FROM `history_order`")
	@Results(id="HistoryOrderResult",value= {
			@Result(id=true,property="historyId",column="history_id"),
			@Result(property="buyerId",column="buyer_id"),
			@Result(property="carId",column="car_id"),
			@Result(property="sellerId",column="seller_id")
			})
	public List<HistoryOrder> getCarOrderCompleted();
	@Select("SELECT order_id,car_id,seller_id,buyer_id,order_time FROM `car_order` WHERE order_status = '已确认'")
	@ResultMap("getCarOrderResult")
	public List<CarOrder> getCarOrderConfirmed();
	@Select("SELECT order_id,car_id,seller_id,buyer_id,order_time FROM `car_order` WHERE order_status = '未确认'")
	@ResultMap("getCarOrderResult")
	public List<CarOrder> getCarOrderUnconfirmed();
}
