package com.book.service;

import java.util.List;

import com.book.model.Cart;

public interface ICartService {

	        //查询所有
			List<Cart> findAll();
			//id查询
			Cart findById(int id);
			//增加
			int add(Cart c);
			//删除
			int del(int id);
			//更改
			int edit(Cart c);
}
