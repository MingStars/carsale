package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class CarInternal {
	@JSONField(ordinal=1)
	private String carId;
	@JSONField(ordinal=2)
	private String mfSteeringWheel;
	@JSONField(ordinal=3)
	private String dlcc;
	@JSONField(ordinal=4)
	private String automaticAirCon;
	@JSONField(ordinal=5)
	private String manualAirCon;
	@JSONField(ordinal=6)
	private String gps;
	@JSONField(ordinal=7)
	private String parkingRedar;
	@JSONField(ordinal=8)
	private String reverseVideo;
	@JSONField(ordinal=9)
	private String leatherSeat;
	@JSONField(ordinal=10)
	private String seatHeating;
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getMfSteeringWheel() {
		return mfSteeringWheel;
	}
	public void setMfSteeringWheel(String mfSteeringWheel) {
		this.mfSteeringWheel = mfSteeringWheel;
	}
	public String getDlcc() {
		return dlcc;
	}
	public void setDlcc(String dlcc) {
		this.dlcc = dlcc;
	}
	public String getAutomaticAirCon() {
		return automaticAirCon;
	}
	public void setAutomaticAirCon(String automaticAirCon) {
		this.automaticAirCon = automaticAirCon;
	}
	public String getManualAirCon() {
		return manualAirCon;
	}
	public void setManualAirCon(String manualAirCon) {
		this.manualAirCon = manualAirCon;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getParkingRedar() {
		return parkingRedar;
	}
	public void setParkingRedar(String parkingRedar) {
		this.parkingRedar = parkingRedar;
	}
	public String getReverseVideo() {
		return reverseVideo;
	}
	public void setReverseVideo(String reverseVideo) {
		this.reverseVideo = reverseVideo;
	}
	public String getLeatherSeat() {
		return leatherSeat;
	}
	public void setLeatherSeat(String leatherSeat) {
		this.leatherSeat = leatherSeat;
	}
	public String getSeatHeating() {
		return seatHeating;
	}
	public void setSeatHeating(String seatHeating) {
		this.seatHeating = seatHeating;
	}
}
