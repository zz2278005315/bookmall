package com.book.model;

public class Admin {

	private int admin_id;//管理员id
	private String admin_name;//管理员登录名
	private String admin_password;//管理员密码
	private String phone;//手机号
	private String nickname;//管理员 昵称
	private String state;//状态
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_password=" + admin_password
				+ ", phone=" + phone + ", nickname=" + nickname + ", state=" + state + "]";
	}
	
	
	
	
}
