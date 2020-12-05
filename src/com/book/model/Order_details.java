package com.book.model;

public class Order_details {

	private int details_id;//订单详情表id
	private int order_id;//订单表id
	private int goods_id;//商品id
	private int num;//购买数量
	public int getDetails_id() {
		return details_id;
	}
	public void setDetails_id(int details_id) {
		this.details_id = details_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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
		return "Order_details [details_id=" + details_id + ", order_id=" + order_id + ", goods_id=" + goods_id
				+ ", num=" + num + "]";
	}
	
	
	
}
