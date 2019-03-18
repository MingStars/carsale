package cn.czwdz.carsale.user.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.Fav;
import cn.czwdz.carsale.user.dao.FavDao;
import cn.czwdz.carsale.user.service.FavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FavServiceimpl  implements FavService {
	@Autowired
	FavDao favDao;
	
	
	public FavDao getFavDao() {
		return favDao;
	}


	public void setFavDao(FavDao favDao) {
		this.favDao = favDao;
	}


	@Override
	public List<Fav> collection() {
		// TODO Auto-generated method stub
		return favDao.collection();
	}


	@Override
	public int deleteCollection(String carId) {
		// TODO Auto-generated method stub
		return favDao.deleteCollection(carId);
	}


	@Override
	public int addCollection(String carId, String uId) {
		// TODO Auto-generated method stub
		return favDao.addCollection(carId, uId);
	}

}
