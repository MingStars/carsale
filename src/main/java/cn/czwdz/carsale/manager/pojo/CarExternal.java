package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class CarExternal {
	 @JSONField(ordinal=1)
	private String carId;
	 @JSONField(ordinal=2)
	private String electronicSunroof;
	 @JSONField(ordinal=3)
	private String panoramicSunroof;
	 @JSONField(ordinal=4)
	private String electronicDoorPull;
	 @JSONField(ordinal=5)
	private String electronicTrunk;
	 @JSONField(ordinal=6)
	private String rainSensingWipers;
	 @JSONField(ordinal=7)
	private String rearWiper;
	 @JSONField(ordinal=8)
	private String powerWindow;
	 @JSONField(ordinal=9)
	private String electronicRearviewMirror;
	 @JSONField(ordinal=10)
	private String rearviewMirrorHeating;
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getElectronicSunroof() {
		return electronicSunroof;
	}
	public void setElectronicSunroof(String electronicSunroof) {
		this.electronicSunroof = electronicSunroof;
	}
	public String getPanoramicSunroof() {
		return panoramicSunroof;
	}
	public void setPanoramicSunroof(String panoramicSunroof) {
		this.panoramicSunroof = panoramicSunroof;
	}
	public String getElectronicDoorPull() {
		return electronicDoorPull;
	}
	public void setElectronicDoorPull(String electronicDoorPull) {
		this.electronicDoorPull = electronicDoorPull;
	}
	public String getElectronicTrunk() {
		return electronicTrunk;
	}
	public void setElectronicTrunk(String electronicTrunk) {
		this.electronicTrunk = electronicTrunk;
	}
	public String getRainSensingWipers() {
		return rainSensingWipers;
	}
	public void setRainSensingWipers(String rainSensingWipers) {
		this.rainSensingWipers = rainSensingWipers;
	}
	public String getRearWiper() {
		return rearWiper;
	}
	public void setRearWiper(String rearWiper) {
		this.rearWiper = rearWiper;
	}
	public String getPowerWindow() {
		return powerWindow;
	}
	public void setPowerWindow(String powerWindow) {
		this.powerWindow = powerWindow;
	}
	public String getElectronicRearviewMirror() {
		return electronicRearviewMirror;
	}
	public void setElectronicRearviewMirror(String electronicRearviewMirror) {
		this.electronicRearviewMirror = electronicRearviewMirror;
	}
	public String getRearviewMirrorHeating() {
		return rearviewMirrorHeating;
	}
	public void setRearviewMirrorHeating(String rearviewMirrorHeating) {
		this.rearviewMirrorHeating = rearviewMirrorHeating;
	}
}
