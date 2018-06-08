package model;

public class Customer {
private int cid;
private String cname;
private Vendor vendor;
private int vid;


public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public Vendor getVendor() {
	return vendor;
}
public void setVendor(Vendor vendor) {
	this.vendor = vendor;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}


}
