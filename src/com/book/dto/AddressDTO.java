package com.book.dto;

import com.book.model.Address;

public class AddressDTO extends Address {
	private int page;
	private int limit;
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
