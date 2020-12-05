package com.book.model;

public class Users {

	private int user_id;//用户编号
	private String user_name;//登录名
	private String user_password;//密码
	private String nickname;//昵称
	private String register_date;//注册时间
	private String login_time;//上次登录时间
	private String face;//头像
	private String balance;//余额
	private String state;//状态，0表示正常
	private String phone;//手机号
	private int address_id;//地址id
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", nickname=" + nickname + ", register_date=" + register_date + ", login_time=" + login_time
				+ ", face=" + face + ", balance=" + balance + ", state=" + state + ", phone=" + phone + ", address_id="
				+ address_id + "]";
	}
	
	
	
}
