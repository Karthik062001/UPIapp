package com.learn.java8;

public class Item {
	
	String itemName;
	int Quantity;
	double pricePerUnit;
	public Item(String itemName, int quantity, double pricePerUnit) {
		super();
		this.itemName = itemName;
		Quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", Quantity=" + Quantity + ", pricePerUnit=" + pricePerUnit + "]";
	}
	
	

}
