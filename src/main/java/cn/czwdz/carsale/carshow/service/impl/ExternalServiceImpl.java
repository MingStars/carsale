package cn.czwdz.carsale.carshow.service.impl;



import cn.czwdz.carsale.carshow.dao.ExternalDao;
import cn.czwdz.carsale.carshow.service.ExternalService;
import cn.czwdz.carsale.manager.pojo.CarExternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExternalServiceImpl implements ExternalService {
	@Autowired
	private ExternalDao externalDao;

	public ExternalDao getExternalDao() {
		return externalDao;
	}

	public void setExternalDao(ExternalDao externalDao) {
		this.externalDao = externalDao;
	}

	

	
	  @Override
	  public CarExternal getExternal(Integer id) {
	  
	  return externalDao.getExternal(id); }
	 

//	@Override
//	public List<CarExternal> getExternal(Integer id) {
//		
//		return externalDao.getExternal(id);
//	}
	
	

}
