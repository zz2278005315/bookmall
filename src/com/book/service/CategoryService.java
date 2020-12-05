package com.book.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.ICategoryDAO;
import com.book.dto.CategoryDTO;
import com.book.model.Category;
import com.book.model.Category;

@Service
public class CategoryService implements ICategoryService {

	@Resource
	private ICategoryDAO categoryDAO;
	@Override
	public Map findAll(CategoryDTO DTO) {
		List<Category> list = categoryDAO.findAll(DTO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}

	@Override
	public Category findAllById(int id) {
		// TODO Auto-generated method stub
		return categoryDAO.findAllById(id);
	}

	@Override
	public int addOrEdit(Category u) {
		int n;
		if(u.getCategory_id() > 0){
			n = categoryDAO.edit(u);
		}else{
			n = categoryDAO.add(u);
		}
		return n;
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return categoryDAO.del(id);
	}

}
