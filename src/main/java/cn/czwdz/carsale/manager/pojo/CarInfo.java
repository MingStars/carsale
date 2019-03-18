package cn.czwdz.carsale.manager.pojo;



import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;


public class CarInfo {
	 @JSONField(ordinal=1)
	private String carId;
	 @JSONField(ordinal=2)
	private String brand;
	 @JSONField(ordinal=3)
	private String carName;
	 @JSONField(ordinal=4)
	 private String confName;
	 @JSONField(ordinal=5)
	 private String level;
	 @JSONField(ordinal=6)
	 private String engine;
	 @JSONField(ordinal=7)
	 private String gearBox;
	 @JSONField(ordinal=8)
	 private String bodyStructure;
	 @JSONField(ordinal=9)
	 private String size;
	 @JSONField(ordinal=10)
	 private String maxImumSpeed;
	 @JSONField(ordinal=11)
	 private String cargoVolume;
	 @JSONField(ordinal=12)
	 private Double carAge;
	 @JSONField(ordinal=13)
	 private Double carMileage;
	 @JSONField(ordinal=14)
	 private String carDamage;
	 @JSONField(ordinal=15)
	 private String isEager;
	 @JSONField(ordinal=16)
	 private Double price;
	 @JSONField(ordinal=17)
	 private String licenseAddress;
	 @JSONField(ordinal=18)
	 private String address;
	 @JSONField(ordinal=19)
	 private String isLocked;
	 @JSONField(ordinal=20)
	 private String uId;
	 @JSONField(ordinal=21,format="yyyy-MM-dd hh:mm:ss")
	 private Date subDate;
	 @JSONField(ordinal=22)
	 private Integer viewedTimes;
	 @JSONField(ordinal=23,format="yyyy-MM-dd hh:mm:ss")
	 private Date orderDate;
	 @JSONField(ordinal=24)
	 private String buyerId;
	 @JSONField(ordinal=25)
	 private String sign;
	 @JSONField(ordinal=26)
	 private String picUrl;
	 private User user;
	
	
	
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getConfName() {
		return confName;
	}
	public void setConfName(String confName) {
		this.confName = confName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getGearBox() {
		return gearBox;
	}
	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
	}
	public String getBodyStructure() {
		return bodyStructure;
	}
	public void setBodyStructure(String bodyStructure) {
		this.bodyStructure = bodyStructure;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaxImumSpeed() {
		return maxImumSpeed;
	}
	public void setMaxImumSpeed(String maxImumSpeed) {
		this.maxImumSpeed = maxImumSpeed;
	}
	public String getCargoVolume() {
		return cargoVolume;
	}
	public void setCargoVolume(String cargoVolume) {
		this.cargoVolume = cargoVolume;
	}
	public Double getCarAge() {
		return carAge;
	}
	public void setCarAge(Double carAge) {
		this.carAge = carAge;
	}
	public Double getCarMileage() {
		return carMileage;
	}
	public void setCarMileage(Double carMileage) {
		this.carMileage = carMileage;
	}
	public String getCarDamage() {
		return carDamage;
	}
	public void setCarDamage(String carDamage) {
		this.carDamage = carDamage;
	}
	public String getIsEager() {
		return isEager;
	}
	public void setIsEager(String isEager) {
		this.isEager = isEager;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getLicenseAddress() {
		return licenseAddress;
	}
	public void setLicenseAddress(String licenseAddress) {
		this.licenseAddress = licenseAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public Date getSubDate() {
		return subDate;
	}
	public void setSubDate(Date subDate) {
		this.subDate = subDate;
	}
	public Integer getViewedTimes() {
		return viewedTimes;
	}
	public void setViewedTimes(Integer viewedTimes) {
		this.viewedTimes = viewedTimes;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
