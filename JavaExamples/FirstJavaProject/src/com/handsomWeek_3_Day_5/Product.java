package com.handsomWeek_3_Day_5;

import java.util.Date;

public class Product {
	private int pid;
	private String pname;
	private String pbrand;
	private int pquantity;
	private double pprice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, String pbrand, int pquantity, double pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pbrand = pbrand;
		this.pquantity = pquantity;
		this.pprice = pprice;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	public int getPbrand() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	
}
