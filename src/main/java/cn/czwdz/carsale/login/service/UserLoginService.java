package cn.czwdz.carsale.login.service;


import javax.servlet.http.HttpServletRequest;

import cn.czwdz.carsale.manager.pojo.User;
import org.apache.ibatis.annotations.Param;





public interface UserLoginService {
	public User checkLogin(@Param("username") String userName, @Param("password") String uPassword);
	public User selectByuStatus(String userName);
	public Integer addUser(@Param("user") User user);
	public User selectByUserName(String userName);
	public User selectByuEmail(String uEmail);
	public User selectByuPhone(String uPhone);
	public Integer updateuStatus(User user);
	public void processRegister(HttpServletRequest request);
    public String processActivate(HttpServletRequest request);
    public void updatePassword(HttpServletRequest request);
    public User selectuEmail(String uPassword, @Param("email") String uEmail);
	public User checkAdminLogin(@Param("username") String userName, @Param("password") String uPassword);
}
