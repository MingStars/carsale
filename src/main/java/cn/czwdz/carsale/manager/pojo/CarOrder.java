package cn.czwdz.carsale.manager.pojo;



import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class CarOrder {
	@JSONField(ordinal=1)
	private String orderId;
	@JSONField(ordinal=2)
	private String carId;
	@JSONField(ordinal=3)
	private String baseinfo;
	@JSONField(ordinal=4)
	private Double carPrice;
	@JSONField(ordinal=5)
	private Double deposit;
	@JSONField(ordinal=6)
	private String sellerId;
	@JSONField(ordinal=7)
	private String address;
	@JSONField(ordinal=8)
	private String buyerId;
	@JSONField(ordinal=9,format="yyyy-MM-dd hh:mm:ss")
	private Date orderTime;
	@JSONField(ordinal=10)
	private String orderStatus;
	@JSONField(ordinal=11)
	private String orderReason;
	@JSONField(ordinal=12)
	private User iuser;
	public User getIuser() {
		return iuser;
	}
	public void setIuser(User iuser) {
		this.iuser = iuser;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getBaseinfo() {
		return baseinfo;
	}
	public void setBaseinfo(String baseinfo) {
		this.baseinfo = baseinfo;
	}
	public Double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderReason() {
		return orderReason;
	}
	public void setOrderReason(String orderReason) {
		this.orderReason = orderReason;
	}
	@Override
	public String toString() {
		return "CarOrder [orderId=" + orderId + ", carId=" + carId + ", baseinfo=" + baseinfo + ", carPrice=" + carPrice
				+ ", deposit=" + deposit + ", sellerId=" + sellerId + ", address=" + address + ", buyerId=" + buyerId
				+ ", orderTime=" + orderTime + ", orderStatus=" + orderStatus + ", orderReason=" + orderReason + "]";
	}
	
}
