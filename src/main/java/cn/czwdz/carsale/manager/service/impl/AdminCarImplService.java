package cn.czwdz.carsale.manager.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.dao.AdminCarDao;
import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.manager.pojo.CarOrder;
import cn.czwdz.carsale.manager.service.AdminCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminCarImplService implements AdminCarService {
    @Autowired
	private AdminCarDao adminCarDao;
	
	@Override
	public List<CarInfo> getCarInfo(String carId, String sellerId, String isLocked) {
		// TODO Auto-generated method stub
		System.out.println("业务层"+carId+sellerId+isLocked);
		return adminCarDao.getCarInfo(carId, sellerId,isLocked);
	}

	public AdminCarDao getAdminCarDao() {
		return adminCarDao;
	}

	public void setAdminCarDao(AdminCarDao adminCarDao) {
		this.adminCarDao = adminCarDao;
	}

	
	
	
	@Override
	public List<CarInfo> getCarAudite() {
		// TODO Auto-generated method stub
		return adminCarDao.getCarAudite();
	}

	@Override
	public List<CarOrder> getCarBooked() {
		// TODO Auto-generated method stub
		return adminCarDao.getCarBooked();
	}

	@Override
	public List<CarInfo> getCarSalable() {
		// TODO Auto-generated method stub
		return adminCarDao.getCarSalable();
	}

	@Override
	public List<CarInfo> getCarSaled() {
		// TODO Auto-generated method stub
		return adminCarDao.getCarSaled();
	}

}
