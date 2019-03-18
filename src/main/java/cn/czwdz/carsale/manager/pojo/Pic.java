package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class Pic {
	@JSONField(ordinal=1)
	private String picId;
	@JSONField(ordinal=2)
	private String picUrl;
	@JSONField(ordinal=3)
	private String carId;
	@JSONField(ordinal=4)
	private Integer picType;
	public String getPicId() {
		return picId;
	}
	public void setPicId(String picId) {
		this.picId = picId;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public Integer getPicType() {
		return picType;
	}
	public void setPicType(Integer picType) {
		this.picType = picType;
	}
}
