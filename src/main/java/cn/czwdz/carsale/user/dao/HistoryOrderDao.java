package cn.czwdz.carsale.user.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;


@Repository
public interface HistoryOrderDao {

	//��Ϊ���ң����۳�������Ϣ
//	@Select("select a.buyer_id,a.car_id,d.uphone,c.conf_name,c.price,c.car_age from history_order a left join car_info c on c. car_id=a.car_id left join user d on d.uid=a.buyer_id")
	@Select("select buyer_id,car_id from history_order")
	@Results({
	
		@Result(column="buyer_id",property="buyerId"),
		@Result(column="car_id",property="carId"),

	@Result(column="buyer_id",property="user",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",fetchType=FetchType.EAGER)),
		
	@Result(column="car_id",property="carInfo",one=@One(select="cn.czwdz.carsale.user.dao.CarInfoDao.help",fetchType=FetchType.EAGER))
	})
	public List<HistoryOrder> buyCar();
	
	
	
	
	//����id��ѯ�����ʷ����
	@Select("select buyer_id,car_id from history_order where car_id=#{carId}")
	@Results({
	
		@Result(column="buyer_id",property="buyerId"),
		@Result(column="car_id",property="carId"),

	@Result(column="buyer_id",property="user",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",fetchType=FetchType.EAGER)),
		
	@Result(column="car_id",property="carInfo",one=@One(select="cn.czwdz.carsale.user.dao.CarInfoDao.help",fetchType=FetchType.EAGER))
	})
	public HistoryOrder buyCarById(@Param("carId") String carId);
	
	
	
	
	
	//����id��ѯ������ʷ����
	@Select("select seller_id,car_id from history_order where car_id=#{carId}")
	@Results({
	
		@Result(column="seller_id",property="sellerId"),
		@Result(column="car_id",property="carId"),

	@Result(column="seller_id",property="user",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",fetchType=FetchType.EAGER)),
		
	@Result(column="car_id",property="carInfo",one=@One(select="cn.czwdz.carsale.user.dao.CarInfoDao.help",fetchType=FetchType.EAGER))
	})
	public HistoryOrder sellCarById(@Param("carId") String carId);
	
	
	
	
	@Select("select seller_id,car_id from history_order")
	@Results({
	
		@Result(column="seller_id",property="sellerId"),
		@Result(column="car_id",property="carId"),

	@Result(column="seller_id",property="user",one=@One(select="cn.czwdz.carsale.user.dao.UserDao.getUphone",fetchType=FetchType.EAGER)),
		
	@Result(column="car_id",property="carInfo",one=@One(select="cn.czwdz.carsale.user.dao.CarInfoDao.help",fetchType=FetchType.EAGER))
	})
	public List<HistoryOrder> sellCar();
}
