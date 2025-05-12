package com.learn.java8;

public class CarTask {

	String Carname;
	String CBrand;
	int price;
	public CarTask(String carname, String cBrand, int price) {
		super();
		Carname = carname;
		CBrand = cBrand;
		this.price = price;
	}
	public String getCarname() {
		return Carname;
	}
	public void setCarname(String carname) {
		Carname = carname;
	}
	public String getCBrand() {
		return CBrand;
	}
	public void setCBrand(String cBrand) {
		CBrand = cBrand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return Carname + " "+CBrand+" "  +price ;
	}
	
	
	
}
