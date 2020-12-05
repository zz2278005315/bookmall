package com.book.model;

public class Cart {

	private int cart_id;//购物车id
	private int  user_id;
	private int goods_id;
	private int  num;
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", user_id=" + user_id + ", goods_id=" + goods_id + ", num=" + num + "]";
	}

	
}
