package com.book.dto;

import com.book.model.Users;

public class UsersDTO extends Users {
	private String startDate;
	private String endDate;
	private int maxBalance;
	private int minBalance;
	private int page;
	private int limit;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getMaxBalance() {
		return maxBalance;
	}
	public void setMaxBalance(int maxBalance) {
		this.maxBalance = maxBalance;
	}
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public int getPage() {
		return (page-1)*getLimit();
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
}
