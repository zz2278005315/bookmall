package com.book.service;

import java.util.List;
import java.util.Map;

import com.book.dto.GoodsDTO;
import com.book.model.Goods;
import com.book.model.Goods;

public interface IGoodsService {
	//根据条件查询所有
	Map findAll(GoodsDTO DTO);
	//根据id查询
	Goods findAllById(int id);
	//查询或修改
	int addOrEdit(Goods u);
	//删除
	int del(int id);
}
