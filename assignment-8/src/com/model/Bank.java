package com.model;

public class Bank {
private String desc;
private int amt;
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getAmt() {
	return amt;
}
public void setAmt(int amt) {
	this.amt = amt;
}
public Bank(String desc, int amt) {
	super();
	this.desc = desc;
	this.amt = amt;
}



}
