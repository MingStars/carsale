package cn.czwdz.carsale.carshow.service.impl;


import cn.czwdz.carsale.carshow.dao.InternalDao;
import cn.czwdz.carsale.carshow.service.InternalService;
import cn.czwdz.carsale.manager.pojo.CarInternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class InternalServiceImpl implements InternalService {
	@Autowired
	private InternalDao internalDao;

	public InternalDao getInternalDao() {
		return internalDao;
	}

	public void setInternalDao(InternalDao internalDao) {
		this.internalDao = internalDao;
	}

	public CarInternal getInternal(Integer id) {
	
		return internalDao.getInternal(id);
	}

//	@Override
//	public List<CarInternal> getInternal(Integer id) {
//
//		return internalDao.getInternal(id);
//	}

}
