package cn.czwdz.carsale.manager.service;

import cn.czwdz.carsale.manager.pojo.Pic;

import java.util.List;



public interface AdminPicService {

	public List<Pic> getCarPic(String carId, String picType);
}
