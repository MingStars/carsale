package cn.czwdz.carsale.user.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.CarInfo;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;


@Repository
public interface CarInfoDao {
//	//作为买方查询已发布汽车信息///收藏夹
	@Select("select car_id,car_name,conf_name,gearbox,engine,body_structure,car_age,car_mileage from car_info WHERE  car_id NOT IN (SELECT DISTINCT car_id FROM fav)")
	@Results({
		@Result(column="car_id",property="carId"),
		@Result(column="car_name",property="carName"),
		@Result(column="conf_name",property="confName"),
		@Result(column="gearbox",property="gearBox"),
		@Result(column="engine",property="engine"),
		@Result(column="body_structure",property="bodyStructure"),
		@Result(column="car_age",property="carAge"),
		@Result(column="car_mileage",property="carMileage"),
	
	})
	public List<CarInfo> faBuCarCollection();
	
	
	
	
	
	
	/********服务方法 2.2+2.1**********/
	@Select("select * from car_info where car_Id=#{carId}")
	@Results({
		@Result(column="car_id",property="carId"),
		@Result(column="car_name",property="carName"),
		@Result(column="conf_name",property="confName"),
		@Result(column="gearbox",property="gearBox"),
		@Result(column="engine",property="engine"),
		@Result(column="body_structure",property="bodyStructure"),
		@Result(column="car_age",property="carAge"),
		@Result(column="car_mileage",property="carMileage"),
		@Result(column="price ",property="price "),
	})
	public CarInfo help(String carId);
	
	//作为买家查询历史订单
	@Select("select * from car_info ")
	@Results({
		@Result(column="car_id",property="carId"),
		@Result(column="car_name",property="carName"),
		@Result(column="conf_name",property="confName"),
		@Result(column="gearbox",property="gearBox"),
		@Result(column="engine",property="engine"),
		@Result(column="body_structure",property="bodyStructure"),
		@Result(column="car_age",property="carAge"),
		@Result(column="car_mileage",property="carMileage"),
		@Result(column="price ",property="price "),
		
		@Result(column="car_id",property="user",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",fetchType=FetchType.EAGER)),
	})
	public List<CarInfo> buyerHistory();
/**
 * "<if test='sc = \"1\"'> and car_age &lt; 2 </if>"+
			"<if test='sc = \"2\"'> and  car_age = 2 </if>"+
			"<if test='sc = \"3\"'> and  car_age &gt; 4 </if>"+
 * @param carId
 * @param carName
 * @param confName
 * @param sc
 * @return
 */
	
	@Select("<script>"+
	        "select car_id,car_name,conf_name,gearbox,engine,body_structure,car_age,car_mileage from car_info"+
			"<where>"+
			"<if test=\"carId!=null\"> car_id like '%${carId}%' </if>"+
			"<if test=\"carName!=null\"> and car_name like '%${carName}%'</if>"+
			"<if test=\"confName!=null\"> and conf_name like '%${confName}%'</if>"+
			"<if test=\"sc==1  and sc!=null\">and car_age &lt; 2</if>"+
			"<if test=\"sc == 2 and sc!=null\">and car_age &gt; 1.9 and car_age &lt; 4.9</if>"+
			"<if test=\"sc == 3 and sc!=null\">and car_age &gt; 5</if>"+
			"</where>"
			+"</script>"
			)
	@Results({
		@Result(column="car_id",property="carId"),
		@Result(column="car_name",property="carName"),
		@Result(column="conf_name",property="confName"),
		@Result(column="gearbox",property="gearBox"),
		@Result(column="engine",property="engine"),
		@Result(column="body_structure",property="bodyStructure"),
		@Result(column="car_age",property="carAge"),
		@Result(column="car_mileage",property="carMileage"),
	
	})
	public List<CarInfo> likefind(@Param("carId") String carId, @Param("carName") String carName, @Param("confName") String confName, @Param("sc") Integer sc);
	
	
	
	//查询车品牌
	@Select("select distinct car_name from car_info")
	public List<String> carnames();
	
	
	@Update("update car_info set conf_name=#{confName} ,price=#{price},car_age=#{carAge} where car_id=#{carId}")
	@Results({
		@Result(column="car_id",property="carId"),
		@Result(column="conf_name",property="confName"),
		@Result(column="price",property="price"),
		@Result(column="car_age",property="carAge"),
	
	})
	public int UpdateCarById(@Param("confName") String confName, @Param("price") Double price, @Param("carAge") Double carAge, @Param("carId") String carId);
}
