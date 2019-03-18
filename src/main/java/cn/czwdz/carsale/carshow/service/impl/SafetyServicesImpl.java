package cn.czwdz.carsale.carshow.service.impl;



import cn.czwdz.carsale.carshow.dao.SafetyDao;
import cn.czwdz.carsale.carshow.service.SafetyServices;
import cn.czwdz.carsale.manager.pojo.CarSafety;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SafetyServicesImpl implements SafetyServices {
	@Autowired 
	private SafetyDao safetyDao;

	public SafetyDao getSafetyDao() {
		return safetyDao;
	}

	public void setSafetyDao(SafetyDao safetyDao) {
		this.safetyDao = safetyDao;
	}

	public CarSafety getSafety(Integer id) {

		return safetyDao.getSafety(id);
	}

//	@Override
//	public List<CarSafety> getSafety(Integer id) {
//
//		return safetyDao.getSafety(id);
//	}

}
