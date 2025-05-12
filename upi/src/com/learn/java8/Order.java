package com.learn.java8;

import java.util.List;

public class Order {

	String OrderId;
	String CustomerName;
	List<Item>items;
	public Order(String orderId, String customerName, List<Item> items) {
		super();
		OrderId = orderId;
		CustomerName = customerName;
		this.items = items;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", CustomerName=" + CustomerName + ", items=" + items + "]";
	}
	
	
	
}
