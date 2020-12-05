package com.book.model;

public class Goods {

	private int goods_id;//商品id
	private String goods_name;//商品名称
	private String price;//单价
	private String picture;//图片
	private String description;//描述
	private String stock;//库存
	private String category_id;//商品分类id
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name + ", price=" + price + ", picture="
				+ picture + ", description=" + description + ", stock=" + stock + ", category_id=" + category_id + "]";
	}
	
	
}
