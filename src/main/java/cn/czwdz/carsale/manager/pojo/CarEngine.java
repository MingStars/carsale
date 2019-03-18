package cn.czwdz.carsale.manager.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class CarEngine {
	 @JSONField(ordinal=1)
	private String carId;
	 @JSONField(ordinal=2)
	private Double displacement;
	 @JSONField(ordinal=3)
	private String intakeForm;
	 @JSONField(ordinal=4)
	private String cylinderArrangement;
	 @JSONField(ordinal=5)
	private String cylinders;
	 @JSONField(ordinal=6)
	private String maximumHorsepower;
	 @JSONField(ordinal=7)
	private String fuel;
	 @JSONField(ordinal=8)
	private String fuelLabel;
	 @JSONField(ordinal=9)
	private String oilsupplyMode;
	 @JSONField(ordinal=10)
	private String enviromentStandard;
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public Double getDisplacement() {
		return displacement;
	}
	public void setDisplacement(Double displacement) {
		this.displacement = displacement;
	}
	public String getIntakeForm() {
		return intakeForm;
	}
	public void setIntakeForm(String intakeForm) {
		this.intakeForm = intakeForm;
	}
	public String getCylinderArrangement() {
		return cylinderArrangement;
	}
	public void setCylinderArrangement(String cylinderArrangement) {
		this.cylinderArrangement = cylinderArrangement;
	}
	public String getCylinders() {
		return cylinders;
	}
	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}
	public String getMaximumHorsepower() {
		return maximumHorsepower;
	}
	public void setMaximumHorsepower(String maximumHorsepower) {
		this.maximumHorsepower = maximumHorsepower;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getFuelLabel() {
		return fuelLabel;
	}
	public void setFuelLabel(String fuelLabel) {
		this.fuelLabel = fuelLabel;
	}
	public String getOilsupplyMode() {
		return oilsupplyMode;
	}
	public void setOilsupplyMode(String oilsupplyMode) {
		this.oilsupplyMode = oilsupplyMode;
	}
	public String getEnviromentStandard() {
		return enviromentStandard;
	}
	public void setEnviromentStandard(String enviromentStandard) {
		this.enviromentStandard = enviromentStandard;
	}
}
