package cn.czwdz.carsale.user.service.impl;

import java.util.List;


import cn.czwdz.carsale.manager.pojo.User;
import cn.czwdz.carsale.user.dao.UserDao;
import cn.czwdz.carsale.user.service.UserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class UserServiceImpl implements UserSerice {
	@Autowired
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User findCommon(String uid) {
		System.out.println(uid+"tttttttttttttttttttttttttttttttttt");
		// TODO Auto-generated method stub
		return userDao.findCommon(uid);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		
		return userDao.update(user);
	}

	@Override
	public Integer updatepwd(String uid, String upassword) {
		// TODO Auto-generated method stub
		return userDao.updatepwd(uid, upassword);
	}
//
//	@Override
//	public List<User> unCommit(String uid) {
//		// TODO Auto-generated method stub
//		return userDao.unCommit();
//	}
//
//	@Override
//	public List<User> findHistoryOrder() {
//		// TODO Auto-generated method stub
//		return userDao.findHistoryOrder();
//	}



	@Override
	public String findPwd(String uid) {
		// TODO Auto-generated method stub
		return userDao.findPwd(uid);
	}
	
	//登录方法
	@Override
	public List<User> login(String username, String upassword) {
		// TODO Auto-generated method stub
		return userDao.login(username, upassword);
	}

	@Override
	public String findidbyname(String username) {
		// TODO Auto-generated method stub
		return userDao.findidbyname(username);
	}

	@Override
	public int updateById(String uid, String uphone) {
		// TODO Auto-generated method stub
		return userDao.updateById(uid, uphone);
	}

	
	
}
