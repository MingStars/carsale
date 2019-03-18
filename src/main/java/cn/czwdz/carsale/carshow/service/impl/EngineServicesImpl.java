package cn.czwdz.carsale.carshow.service.impl;



import cn.czwdz.carsale.carshow.dao.EngineDao;
import cn.czwdz.carsale.carshow.service.EngineServices;
import cn.czwdz.carsale.manager.pojo.CarEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EngineServicesImpl implements EngineServices {
	@Autowired
	private EngineDao engineDao;

	public EngineDao getEngineDao() {
		return engineDao;
	}

	public void setEngineDao(EngineDao engineDao) {
		this.engineDao = engineDao;
	}

	@Override
	public CarEngine getEngine(Integer id) {
		
		return engineDao.getEngineDao(id);
	}



}
