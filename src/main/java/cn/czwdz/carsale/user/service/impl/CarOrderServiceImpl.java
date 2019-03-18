package cn.czwdz.carsale.user.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.CarOrder;
import cn.czwdz.carsale.user.dao.CarOrderDao;
import cn.czwdz.carsale.user.service.CarOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CarOrderServiceImpl implements CarOrderService {
	@Autowired
	CarOrderDao carOrderDao;
	
	public CarOrderDao getCarOrderDao() {
		return carOrderDao;
	}

	public void setCarOrderDao(CarOrderDao carOrderDao) {
		this.carOrderDao = carOrderDao;
	}

	@Override
	public List<CarOrder> unCommit0() {
		// TODO Auto-generated method stub
		return carOrderDao.unCommit0();
	}

	@Override
	public List<CarOrder> unCommitBuyer() {
		// TODO Auto-generated method stub
		return carOrderDao.unCommitBuyer();
	}

	@Override
	public int updateStatus(String orderId) {
		// TODO Auto-generated method stub
		return carOrderDao.updateStatus(orderId);
	}

}
