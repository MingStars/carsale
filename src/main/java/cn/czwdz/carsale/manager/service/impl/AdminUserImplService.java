package cn.czwdz.carsale.manager.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.dao.AdminUserDao;
import cn.czwdz.carsale.manager.pojo.User;
import cn.czwdz.carsale.manager.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminUserImplService implements AdminUserService {
    @Autowired
	private AdminUserDao adminUserDao;
	
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return adminUserDao.getUser();
	}
	@Override
	public List<User> getUserByPhone(String uPhone,String uid,String username) {
		// TODO Auto-generated method stub
		return adminUserDao.getUserByPhone(uPhone,uid,username);
	}

	@Override
	public List<User> getUserTran(String uid) {
		// TODO Auto-generated method stub
		return adminUserDao.getUserTran(uid);
	}

	public AdminUserDao getAdminUserDao() {
		return adminUserDao;
	}

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}
	@Override
	public Integer addUserKey(String uid, Integer sign) {
		// TODO Auto-generated method stub
		return adminUserDao.addUserKey(uid, sign);
	}
	@Override
	public List<User> getBuyUser() {
		// TODO Auto-generated method stub
		return adminUserDao.getBuyUser();
	}
	@Override
	public List<User> getSellerUser() {
		// TODO Auto-generated method stub
		return adminUserDao.getSellerUser();
	}



	

}
