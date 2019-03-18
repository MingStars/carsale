package cn.czwdz.carsale.manager.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.dao.AdminPicDao;
import cn.czwdz.carsale.manager.pojo.Pic;
import cn.czwdz.carsale.manager.service.AdminPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminPicImplService implements AdminPicService {
@Autowired
private AdminPicDao adminPicDao;
	
	
	@Override
	public List<Pic> getCarPic(String carId, String picType) {
		// TODO Auto-generated method stub
		return adminPicDao.getCarPic(carId,picType);
	}


	public AdminPicDao getAdminPicDao() {
		return adminPicDao;
	}


	public void setAdminPicDao(AdminPicDao adminPicDao) {
		this.adminPicDao = adminPicDao;
	}

}
