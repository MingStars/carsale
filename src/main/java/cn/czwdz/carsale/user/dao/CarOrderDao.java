package cn.czwdz.carsale.user.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.CarOrder;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;


@Repository
public interface CarOrderDao {
	/***作为卖方，订单确认****/
	//and order_status='未确认'
	@Select("select * from car_order where  order_status='未确认'")
	@Results({
		
		@Result(id=true,column="order_id",property="orderId"),
		@Result(column="car_id",property="carId"),
		@Result(column="baseinfo",property="baseinfo"),
		@Result(column="car_price",property="carPrice"),
		@Result(column="deposit",property="deposit"),
		@Result(column="seller_id",property="sellerId"),
		@Result(column="order_time",property="orderTime"),
		@Result(column="order_status",property="orderStatus"),
		@Result(column="buyer_id",property="buyerId"),
		@Result(column="address",property="address"),
		
		
	@Result(column="seller_id",property="iuser",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",
			fetchType=FetchType.EAGER))
		})
	public List<CarOrder> unCommit0();
	
	
	@Select("select * from car_order where  order_status='未确认'")
	@Results({
		
		@Result(id=true,column="order_id",property="orderId"),
		@Result(column="car_id",property="carId"),
		@Result(column="baseinfo",property="baseinfo"),
		@Result(column="car_price",property="carPrice"),
		@Result(column="deposit",property="deposit"),
		@Result(column="seller_id",property="sellerId"),
		@Result(column="order_time",property="orderTime"),
		@Result(column="order_status",property="orderStatus"),
		@Result(column="buyer_id",property="buyerId"),
		@Result(column="address",property="address"),
		
		
	@Result(column="buyer_id",property="iuser",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",
			fetchType=FetchType.EAGER))
		})
	public List<CarOrder> unCommitBuyer();
	
	
	@Update("update car_order set order_status='已确认' where order_id=#{orderId}")
	@Results({
		@Result(id=true,column="order_id",property="orderId"),
		@Result(column="order_status",property="orderStatus"),
	})
	public int updateStatus(@Param("orderId") String orderId);
}
