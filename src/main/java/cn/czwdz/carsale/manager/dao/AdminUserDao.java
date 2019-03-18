package cn.czwdz.carsale.manager.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminUserDao {
    //标星方法
	@Insert("INSERT INTO USER SET sign=#{sign} where uid=#{uid}")
	public Integer addUserKey(String uid, Integer sign);
	
	//AllUser页面方法
	@Select("SELECT * FROM USER")
	public List<User> getUser();
	@Select("<script>" +
	         "SELECT uid,username,uname,uphone,uregistertime,uloadtime FROM `user`"+
	         "<where>" +
	         "<if test=\"uPhone != null and uPhone!= ''\"> uphone=#{uPhone}</if>"+
	         "<if test=\"uid != null and uid!= ''\">and uid=#{uid}</if>"+
	         "<if test=\"username != null and username!= ''\">and username=#{username}</if>"+
	         "</where></script>")
	public List<User> getUserByPhone(@Param("uPhone") String uPhone, @Param("uid") String uid, @Param("username") String username);
	
	@Select("SELECT * FROM USER WHERE uid=#{uid}")
	public List<User> getUserTran(String uid);
	
	//buyUser页面方法
	@Select("SELECT u.uid,u.username,u.uname,u.uemail,u.uphone,uregistertime FROM USER u,(SELECT DISTINCT buyer_id FROM car_order) o WHERE u.uid=o.buyer_id")
	public List<User> getBuyUser();
	
	//sellerUser页面方法
	@Select("SELECT u.uid,u.username,u.uname,u.uemail,u.uphone,uregistertime,uloadtime FROM USER u ,(SELECT DISTINCT seller_id FROM car_order) o WHERE u.uid=o.seller_id")
	public List<User> getSellerUser();
}
