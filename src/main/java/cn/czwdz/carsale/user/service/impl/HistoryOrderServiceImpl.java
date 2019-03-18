package cn.czwdz.carsale.user.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import cn.czwdz.carsale.user.dao.HistoryOrderDao;
import cn.czwdz.carsale.user.service.HistoryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class HistoryOrderServiceImpl implements HistoryOrderService {
	@Autowired
	HistoryOrderDao historyOrderDao;
	
	public HistoryOrderDao getHistoryOrderDao() {
		return historyOrderDao;
	}

	public void setHistoryOrderDao(HistoryOrderDao historyOrderDao) {
		this.historyOrderDao = historyOrderDao;
	}

	@Override
	public List<HistoryOrder> sellCar() {
		// TODO Auto-generated method stub
		return historyOrderDao.sellCar();
	}

	@Override
	public List<HistoryOrder> buyCar() {
		// TODO Auto-generated method stub
		return historyOrderDao.buyCar();
	}

	@Override
	public HistoryOrder buyCarById(String carId) {
		// TODO Auto-generated method stub
		return historyOrderDao.buyCarById(carId);
	}

	@Override
	public HistoryOrder sellCarById(String carId) {
		// TODO Auto-generated method stub
		return historyOrderDao.sellCarById(carId);
	}

}
