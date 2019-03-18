package cn.czwdz.carsale.login.dao;

import cn.czwdz.carsale.manager.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Repository
public interface UserLoginDao {
	//用户登录
	@Select("SELECT * FROM USER WHERE USERNAME=#{username} AND UPASSWORD=#{password}")
	public User checkLogin(@Param("username") String userName, @Param("password") String uPassword);
	//shiro认证用方法
	@Select("SELECT * FROM USER WHERE USERNAME=#{username}")
	public User checkLoginShiro(@Param("username") String userName);
	//判断用户账号是否已激活
	@Select("SELECT * FROM USER WHERE USERNAME=#{userName} AND USTATUS='1'")
	public User selectByuStatus(String userName);
	
	//新用户注册GO
	@Insert("INSERT INTO USER(UID,USERNAME,UPASSWORD,UEMAIL,UPHONE,UREGISTERTIME,USTATUS,UVALIDATECODE,ULOADTIME)"
			+ "VALUES(#{uId},#{userName},#{uPassword},#{uEmail},#{uPhone},#{uRegisterTime},#{uStatus},"
			+ "#{uValidateCode},#{uLoadTime})")
	public Integer addUser(User user);
	//判断用户名是否已被使用
	@Select("SELECT * FROM USER WHERE USERNAME=#{userName}")
	public User selectByUserName(String userName);
	//判断邮箱是否已被使用
	@Select("SELECT * FROM USER WHERE UEMAIL=#{uEmail}")
	public User selectByuEmail(String uEmail);
	//判断手机号是否已被注册
	@Select("SELECT * FROM USER WHERE UPHONE=#{uPhone}")
	public User selectByuPhone(String uPhone);
	//修改激活状态
	@Update("UPDATE USER SET USERNAME=#{userName},UPASSWORD=#{uPassword},UEMAIL=#{uEmail},UPHONE=#{uPhone},"
			+ "UREGISTERTIME=#{uRegisterTime},USTATUS=#{uStatus},UVALIDATECODE=#{uValidateCode} "
			+ "WHERE UID=#{uId}")
	public Integer updateuStatus(User user);
	//修改密码
		@Select("UPDATE USER SET UPASSWORD=#{uPassword} WHERE UEMAIL=#{email}")
		public User selectuEmail(@Param("uPassword") String uPassword, @Param("email") String uEmail);
	
	//管理员登录
	@Select("SELECT * FROM USER WHERE USERNAME=#{username} AND UPASSWORD=#{password} AND UID='11111' ")
	public User checkAdminLogin(@Param("username") String userName, @Param("password") String uPassword);
}
