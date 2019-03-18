package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;



public class HistoryOrder {
	@JSONField(ordinal=1)
	private String historyId;
	@JSONField(ordinal=2)
	private String buyer;
	@JSONField(ordinal=3)
	private String buyerId;
	@JSONField(ordinal=4)
	private String car;
	@JSONField(ordinal=5)
	private String carId;
	@JSONField(ordinal=6)
	private String seller;
	@JSONField(ordinal=7)
	private String sellerId;
	
    private CarInfo carInfo;
	
	private User user;
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getHistoryId() {
		return historyId;
	}
	public void setHistoryId(String historyId) {
		this.historyId = historyId;
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
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	@Override
	public String toString() {
		return "HistoryOrder [historyId=" + historyId + ", buyer=" + buyer + ", buyerId=" + buyerId + ", car=" + car
				+ ", carId=" + carId + ", seller=" + seller + ", sellerId=" + sellerId + "]";
	}
	public CarInfo getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
