package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class CarChassis {
	 @JSONField(ordinal=1)
	private String carId;
	 @JSONField(ordinal=2)
	private String driveMode;
	 @JSONField(ordinal=3)
	private String autoPowerType;
	 @JSONField(ordinal=4)
	private String frontSuspensionType;
	 @JSONField(ordinal=5)
	private String rearSuspensionType;
	 @JSONField(ordinal=6)
	private String frontBrakeType;
	 @JSONField(ordinal=7)
	private String rearBrakeType;
	 @JSONField(ordinal=8)
	private String parkingBrakeType;
	 @JSONField(ordinal=9)
	private String frontWheelSize;
	 @JSONField(ordinal=10)
	private String rearWheelSize;
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getDriveMode() {
		return driveMode;
	}
	public void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}
	public String getAutoPowerType() {
		return autoPowerType;
	}
	public void setAutoPowerType(String autoPowerType) {
		this.autoPowerType = autoPowerType;
	}
	public String getFrontSuspensionType() {
		return frontSuspensionType;
	}
	public void setFrontSuspensionType(String frontSuspensionType) {
		this.frontSuspensionType = frontSuspensionType;
	}
	public String getRearSuspensionType() {
		return rearSuspensionType;
	}
	public void setRearSuspensionType(String rearSuspensionType) {
		this.rearSuspensionType = rearSuspensionType;
	}
	public String getFrontBrakeType() {
		return frontBrakeType;
	}
	public void setFrontBrakeType(String frontBrakeType) {
		this.frontBrakeType = frontBrakeType;
	}
	public String getRearBrakeType() {
		return rearBrakeType;
	}
	public void setRearBrakeType(String rearBrakeType) {
		this.rearBrakeType = rearBrakeType;
	}
	public String getParkingBrakeType() {
		return parkingBrakeType;
	}
	public void setParkingBrakeType(String parkingBrakeType) {
		this.parkingBrakeType = parkingBrakeType;
	}
	public String getFrontWheelSize() {
		return frontWheelSize;
	}
	public void setFrontWheelSize(String frontWheelSize) {
		this.frontWheelSize = frontWheelSize;
	}
	public String getRearWheelSize() {
		return rearWheelSize;
	}
	public void setRearWheelSize(String rearWheelSize) {
		this.rearWheelSize = rearWheelSize;
	}
}
