package cn.czwdz.carsale.user.service.impl;

import java.util.List;


import cn.czwdz.carsale.manager.pojo.CarInfo;
import cn.czwdz.carsale.user.dao.CarInfoDao;
import cn.czwdz.carsale.user.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CarInfoServiceImpl implements CarInfoService {
	@Autowired
	CarInfoDao carInfoDao;
	
	
	public CarInfoDao getCarInfoDao() {
		return carInfoDao;
	}


	public void setCarInfoDao(CarInfoDao carInfoDao) {
		this.carInfoDao = carInfoDao;
	}


	@Override
	public CarInfo help(String carId) {
		return carInfoDao.help(carId);
	}

	@Override
	public List<CarInfo> faBuCarCollection() {
		// TODO Auto-generated method stub
		return carInfoDao.faBuCarCollection();
	}




	@Override
	public List<CarInfo> buyerHistory() {
		// TODO Auto-generated method stub
		return carInfoDao.buyerHistory();
	}


	@Override
	public List<CarInfo> likefind(String carId, String carName, String confName,Integer sc) {
		// TODO Auto-generated method stub
		
		System.out.println("111111");
		return carInfoDao.likefind(carId, carName, confName,sc);
	}


	@Override
	public List<String> carnames() {
		// TODO Auto-generated method stub
		return carInfoDao.carnames();
	}


	@Override
	public int UpdateCarById(String confName, Double price, Double carAge, String carId) {
		// TODO Auto-generated method stub
		return carInfoDao.UpdateCarById(confName, price, carAge, carId);
	}



}
