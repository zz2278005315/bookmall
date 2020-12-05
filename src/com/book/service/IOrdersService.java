package com.book.service;

import java.util.List;

import com.book.model.Orders;

public interface IOrdersService {
	
	        //查询所有
			List<Orders> findAll();
			//id查询
			Orders findById(int id);
			//增加
			int add(Orders a);
			//删除
			int del(int id);
			//更改
			int edit(Orders a);
}
