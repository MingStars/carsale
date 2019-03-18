package cn.czwdz.carsale.manager.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {

	@Select("SELECT * FROM history_order")
	@Results(value = {
            @Result(id = true , property = "historyId" , column = "history_id"),
            @Result(property = "buyerId" , column = "buyer_id"),        
            @Result(property = "carId" , column = "car_id"),       
            @Result(property = "sellerId" , column = "seller_id")
            })
	public List<HistoryOrder> getHistoryOrder();
	
	
	@Select("<script>" +
			"SELECT * FROM (SELECT history_id,(SELECT uname FROM USER WHERE uid=h.buyer_id)buyer,buyer_id,(SELECT car_name FROM car_info WHERE car_id=h.`car_id`) car," + 
			"car_id,(SELECT uname FROM USER WHERE uid=h.`seller_id`) seller,seller_id FROM history_order h )f" + 
			"<where>" +
            "<if test=\"buyer != null and buyer!=''\"> f.buyer LIKE '%${buyer}%'" +
            "</if><if test=\"historyId != null and historyId!= ''\"> f.history_id = #{historyId}"+
            "</if><if test=\"car != null and car!=''\"> f.car = #{car}"+
            "</if><if test=\"seller != null and seller!=''\"> f.seller = #{seller}</if></where> " +
            "</script>")
	 @Results(value = {
	            @Result(id = true , property = "historyId" , column = "history_id"),
	            @Result(property = "buyer" , column = "buyer"),
	            @Result(property = "buyerId" , column = "buyer_id"),
	            @Result(property = "car" , column = "car"),
	            @Result(property = "carId" , column = "car_id"),
	            @Result(property = "seller" , column = "seller"),
	            @Result(property = "sellerId" , column = "seller_id")
	            })
	public List<HistoryOrder> getHistoryOrderByName(@Param("historyId") String id, @Param("buyer") String buyer, @Param("car") String car, @Param("seller") String seller, @Param("current") Integer current);
		
	@Delete("Delete FROM history_order WHERE history_id=#{id}")
	public Integer deleteHistoryOrder(Integer id);
	
	@Select("SELECT COUNT(1) FROM history_order")
	public Integer getCount();
	
	@Select("SELECT COUNT(1) FROM history_order "+
			"<where>" +
            "<if test=\"buyer != null and buyer!=''\"> f.buyer LIKE '%${buyer}%'" +
            "</if><if test=\"historyId != null and historyId !=''\"> f.history_id = #{historyId}"+
            "</if><if test=\"car != null and car!=''\"> f.car = #{car}"+
            "</if><if test=\"seller != null and seller!=''\"> f.seller = #{seller}</if></where> "+
            "</script>")
	public Integer getCountByName(@Param("historyId") String id, @Param("buyer") String buyer, @Param("car") String car, @Param("seller") String seller);
	
}
