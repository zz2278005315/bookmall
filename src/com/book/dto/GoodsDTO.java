package com.book.dto;

import com.book.model.Goods;

public class GoodsDTO extends Goods {
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
