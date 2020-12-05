package com.book.model;

public class Address {

	private int address_id;//地址id
	private String province;//省
	private String city;//市
	private String country;//县区
	private String details;//详细地址
	private int user_id;//用户id
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "address [address_id=" + address_id + ", province=" + province + ", city=" + city + ", country="
				+ country + ", details=" + details + ", user_id=" + user_id + "]";
	}
	
	
	
}
