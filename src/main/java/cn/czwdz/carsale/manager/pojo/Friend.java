package cn.czwdz.carsale.manager.pojo;

public class Friend {
private String uid;
private String fid;
private String uTof;
private String fTou;

public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public String getuTof() {
	return uTof;
}
public void setuTof(String uTof) {
	this.uTof = uTof;
}
public String getfTou() {
	return fTou;
}
public void setfTou(String fTou) {
	this.fTou = fTou;
}
@Override
public String toString() {
	return "Friend [uid=" + uid + ", fid=" + fid + ", uTof=" + uTof + ", fTou=" + fTou + "]";
}



}
