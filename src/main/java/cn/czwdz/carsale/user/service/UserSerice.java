package cn.czwdz.carsale.user.service;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.User;
import org.apache.ibatis.annotations.Param;





public interface UserSerice {
	
	
	public String findidbyname(@Param("username") String username);
	
	public List<User> login(@Param("username") String username, @Param("upassword") String upassword);
	
	public User findCommon(@Param("uid") String uid);
	
	public int update(User user);
	
	public Integer updatepwd(@Param("uid") String uid, @Param("upassword") String upassword);
	
	public String findPwd(@Param("uid") String uid);
	
	public int updateById(String uid, String uphone);
	
//	public List<User> unCommit(String uid);
	
	
//	
//	public List<User> findHistoryOrder();
//	
	

}
