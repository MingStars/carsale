package cn.czwdz.carsale.manager.pojo;







import java.beans.Transient;
import java.util.Calendar;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class User {
	/**
	 * uid
	 * username      用户名 用户的唯一标识
	 * upassword     用户的登录密码
	 * uname         用户的真实姓名
	 * uage          用户年龄，选填
	 * usex          用户性别，选填
	 * uemail        用户电子邮箱，必填，验证
	 * uphone        用户联系方式，必填，与买家（卖家）交流的渠道
	 * uregistertime 注册（指填写完信息）的时间
	 * ustatus       激活状态
	 * uvalidatecode 激活码
	 */
	@JSONField(ordinal=1)
	private String uId;
	@JSONField(ordinal=2)
	private String userName;
	@JSONField(ordinal=3)
	private String uPassword;
	@JSONField(ordinal=4)
	private String uName;
	@JSONField(ordinal=5)
	private Integer uAge;
	@JSONField(ordinal=6)
	private String uSex;
	@JSONField(ordinal=7)
	private String uEmail;
	@JSONField(ordinal=8)
	private String uPhone;
	@JSONField(ordinal=9,format="yyyy-MM-dd hh:mm:ss")
	private Date uRegisterTime;
	@JSONField(ordinal=10)
	private Integer uStatus;
	@JSONField(ordinal=11)
	private String uValidateCode;
	@JSONField(ordinal=12,format="yyyy-MM-dd hh:mm:ss")
	private Date uLoadTime;
	@JSONField(ordinal=13)
	private String uTran;
	@JSONField(ordinal=14)
	private String sign;
	@JSONField(ordinal=15)
	private String uPhoto;
	@JSONField(ordinal=16)
	private String internetstatus;
	
	public String getInternetstatus() {
		return internetstatus;
	}
	public void setInternetstatus(String internetstatus) {
		this.internetstatus = internetstatus;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public Integer getuAge() {
		return uAge;
	}
	public void setuAge(Integer uAge) {
		this.uAge = uAge;
	}
	public String getuSex() {
		return uSex;
	}
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public Date getuRegisterTime() {
		return uRegisterTime;
	}
	public void setuRegisterTime(Date uRegisterTime) {
		this.uRegisterTime = uRegisterTime;
	}
	public Integer getuStatus() {
		return uStatus;
	}
	public void setuStatus(Integer uStatus) {
		this.uStatus = uStatus;
	}
	public String getuValidateCode() {
		return uValidateCode;
	}
	public void setuValidateCode(String uValidateCode) {
		this.uValidateCode = uValidateCode;
	}
	public Date getuLoadTime() {
		return uLoadTime;
	}
	public void setuLoadTime(Date uLoadTime) {
		this.uLoadTime = uLoadTime;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String string) {
		this.sign = string;
	}
	public String getuPhoto() {
		return uPhoto;
	}
	public void setuPhoto(String uPhoto) {
		this.uPhoto = uPhoto;
	}
	public String getuTran() {
		return uTran;
	}
	public void setuTran(String uTran) {
		this.uTran = uTran;
	}
     @Transient
     @JSONField(ordinal=17,format="yyyy-MM-dd hh:mm:ss")
     public Date getLastActivateTime() { 
     Calendar cl =Calendar.getInstance();
     cl.setTime(uRegisterTime);
     cl.add(Calendar.DATE , 2);
	 return cl.getTime(); }
	
	
}
