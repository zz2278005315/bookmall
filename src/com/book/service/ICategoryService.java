package com.book.service;

import java.util.Map;

import com.book.dto.CategoryDTO;
import com.book.model.Category;

public interface ICategoryService {
	//根据条件查询所有
	Map findAll(CategoryDTO DTO);
	//根据id查询
	Category findAllById(int id);
	//查询或修改
	int addOrEdit(Category u);
	//删除
	int del(int id);
}
