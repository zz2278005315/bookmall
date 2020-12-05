package com.book.model;

public class Orders {

	private int orders_id;
	private String orders_time;//下单时间
	private int user_id;
	private String state;//状态
	private String total_money;;//订单金额
	private int address_id;
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public String getOrders_time() {
		return orders_time;
	}
	public void setOrders_time(String orders_time) {
		this.orders_time = orders_time;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTotal_money() {
		return total_money;
	}
	public void setTotal_money(String total_money) {
		this.total_money = total_money;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	@Override
	public String toString() {
		return "Orders [orders_id=" + orders_id + ", orders_time=" + orders_time + ", user_id=" + user_id + ", state="
				+ state + ", total_money=" + total_money + ", address_id=" + address_id + "]";
	}
	
	
}
