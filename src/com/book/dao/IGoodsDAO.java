package com.book.dao;

import java.util.List;

import com.book.dto.GoodsDTO;
import com.book.model.Goods;

public interface IGoodsDAO {
		//根据条件查询
		List<Goods> findAll(GoodsDTO DTO);
		//根据id查询
		Goods findAllById(int id);
		//增加
		int add(Goods a);
		//删除
		int del(int id);
		//更改
		int edit(Goods a);
}
