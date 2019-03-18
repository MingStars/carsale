package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class Fav {
	@JSONField(ordinal=1)
	private String id;
	@JSONField(ordinal=2)
	private String carId;
	@JSONField(ordinal=3)
	private User user;
	@JSONField(ordinal=4)
	private CarInfo carInfo;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public CarInfo getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}

}
