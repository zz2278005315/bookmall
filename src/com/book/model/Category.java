package com.book.model;

public class Category {

	private int category_id;
	private String category_name;//商品分类名称
	private String parent_id;//父分类编号
	private String state; //状态
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", parent_id=" + parent_id
				+ ", state=" + state + "]";
	}
	
	
	
}
