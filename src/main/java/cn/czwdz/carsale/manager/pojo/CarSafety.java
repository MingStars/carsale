package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class CarSafety {
	@JSONField(ordinal=1)
	private String carId;
	@JSONField(ordinal=2)
	private String frontAirbag;
	@JSONField(ordinal=3)
	private String headAirbag;
	@JSONField(ordinal=4)
	private String childSeatInt;
	@JSONField(ordinal=5)
	private String tpms;
	@JSONField(ordinal=6)
	private String carLock;
	@JSONField(ordinal=7)
	private String abs;
	@JSONField(ordinal=8)
	private String usc;
	@JSONField(ordinal=9)
	private String pss;
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getFrontAirbag() {
		return frontAirbag;
	}
	public void setFrontAirbag(String frontAirbag) {
		this.frontAirbag = frontAirbag;
	}
	public String getHeadAirbag() {
		return headAirbag;
	}
	public void setHeadAirbag(String headAirbag) {
		this.headAirbag = headAirbag;
	}
	public String getChildSeatInt() {
		return childSeatInt;
	}
	public void setChildSeatInt(String childSeatInt) {
		this.childSeatInt = childSeatInt;
	}
	public String getTpms() {
		return tpms;
	}
	public void setTpms(String tpms) {
		this.tpms = tpms;
	}
	public String getCarLock() {
		return carLock;
	}
	public void setCarLock(String carLock) {
		this.carLock = carLock;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	public String getUsc() {
		return usc;
	}
	public void setUsc(String usc) {
		this.usc = usc;
	}
	public String getPss() {
		return pss;
	}
	public void setPss(String pss) {
		this.pss = pss;
	}
}