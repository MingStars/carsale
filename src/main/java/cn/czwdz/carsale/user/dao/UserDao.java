package cn.czwdz.carsale.user.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

	// 登录方法
	@Select("SELECT * FROM USER WHERE USERNAME=#{username} AND UPASSWORD=#{upassword}")
	@Results(id="UserResult",value= {
			@Result(id=true,property="uId",column="uid"),
			@Result(property="userName",column="username"),
			@Result(property="uPassword",column="upassword"),
			@Result(property="uName",column="uname"),
			@Result(property="uAge",column="uage"),
			@Result(property="uSex",column="usex"),
			@Result(property="uEmail",column="uemail"),
			@Result(property="uPhone",column="uphone"),
			@Result(property="uRegisterTime",column="uregistertime"),
			@Result(property="uStatus",column="ustatus"),
			@Result(property="uValidateCode",column="uvalidatecode"),
			@Result(property="uLoadTime",column="uloadtime"),
			@Result(property="sign",column="sign"),
			@Result(property="uPhoto",column="uphoto"),
			@Result(property="internetstatus",column="internetstatus")
	})
	public List<User> login(@Param("username") String username, @Param("upassword") String upassword);

	@Select("select uid from user where username=#{username}")
	@ResultMap("UserResult")
	public String findidbyname(@Param("username") String username);

	// 通用查询
	@Select("select * from user where uid=#{uid} ORDER BY internetstatus='绿' DESC,internetstatus='黄' DESC,internetstatus='红' DESC,internetstatus='白' DESC;")
	@ResultMap("UserResult")
	public User findCommon(@Param("uid") String uid);
	
	// //通用修改（根据id）
	@Update("update  user set uname=#{uname},usex=#{usex},uage=#{uage},uphone=#{uphone},uphoto=#{uPhoto} where uid=#{uid}")
	public int update(User user);

	@Update("update user set uphone=#{uphone} where uid=#{uid}")
	public int updateById(@Param("uid") String uid, @Param("uphone") String uphone);

	/***** 密码 *******/
	@Select("select upassword from user where uid=#{uid}")
	@ResultMap("UserResult")
	public String findPwd(String uid);

	// //修改密码
	@Update("update user set upassword=#{upassword} where uid=#{uid}")
	public Integer updatepwd(@Param("uid") String uid, @Param("upassword") String upassword);

	// //作为买方查询未完成订单
	// @Select("select
	// a.order_id,a.car_id,a.baseinfo,a.car_price,a.deposit,a.seller_id,a.address,a.order_time,a.order_status,b.uphone
	// from user b,car_order a where a.buyer_id=b.uid and a.order_status='未确认'")
	// public List<User> unCommit();
	/******** 服务方法 2.2+2.1 **********/
	@Select("select * from user where uid=#{uid}")
	@ResultMap("UserResult")
	public User getUphone(String uid);

	// //查询买家历史订单////查询已完成历史订单
	// @Select("select
	// a.buyer_id,a.car_id,d.uphone,c.conf_name,c.price,c.car_age from
	// history_order a left join car_info c on c. car_id=a.car_id left join user
	// d on d.uid=a.buyer_id")
	// public List<User> findHistoryOrder();
	//

	// //查询已完成历史订单
	// @Select("")
	// public List<User> Collection();
	//
	// //查询买家历史订单
}
