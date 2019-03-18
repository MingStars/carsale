package cn.czwdz.carsale.manager.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.Pic;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminPicDao {

	@Select("<script>"+
			"SELECT * FROM `pic`"+
			"<where>"+
			"<if test=\"carId!=null and carId!= '' \">carId = #{carId}</if>"+
			"<if test=\"picType!=null and picType!='' \">pic_type = #{picType}</if>"+
			"</where></script>")
	@Results(value= {
			@Result(id=true,property="picId",column="pic_id"),
			@Result(property="picUrl",column="pic_url"),
			@Result(property="carId",column="car_id"),
			@Result(property="picType",column="pic_type")
	})
	public List<Pic> getCarPic(@Param("carId") String carId, @Param("picType") String picType);
}
