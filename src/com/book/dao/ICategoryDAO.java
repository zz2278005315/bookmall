package com.book.dao;

import java.util.List;

import com.book.dto.CategoryDTO;
import com.book.model.Category;

public interface ICategoryDAO {
		//根据条件查询
		List<Category> findAll(CategoryDTO DTO);
		//根据id查询
		Category findAllById(int id);
		//增加
		int add(Category a);
		//删除
		int del(int id);
		//更改
		int edit(Category a);
}
