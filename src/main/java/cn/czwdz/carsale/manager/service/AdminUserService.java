package cn.czwdz.carsale.manager.service;

import cn.czwdz.carsale.manager.pojo.User;

import java.util.List;



public interface AdminUserService {

	//查询所有用户
	public List<User> getUser();
	//查询根据手机号码
	public List<User> getUserByPhone(String uPhone, String uid, String username);
	//查询交易记录
	public List<User> getUserTran(String uid);
	//标星方法
	public Integer addUserKey(String uid, Integer sign);
	//查询买家
	public List<User> getBuyUser();
	//查询卖家
	public List<User> getSellerUser();
}
