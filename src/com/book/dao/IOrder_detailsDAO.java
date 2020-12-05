package com.book.dao;

import java.util.List;

import com.book.model.Order_details;

public interface IOrder_detailsDAO {

	//查询所有
			List<Order_details> findAll();
			//id查询
			Order_details findById(int id);
			//增加
			int add(Order_details o);
			//删除
			int del(int id);
			//更改
			int edit(Order_details o);
}
