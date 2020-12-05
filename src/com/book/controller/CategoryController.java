package com.book.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.dto.CategoryDTO;
import com.book.model.Category;
import com.book.service.ICategoryService;

@ResponseBody
@Controller
public class CategoryController {
	@Resource
	private ICategoryService categoryService;
	@RequestMapping("/categoryFindAll.do")
	public Map findAll(CategoryDTO DTO){
		return categoryService.findAll(DTO);
	}
	@RequestMapping("/categoryFindAllById.do")
	public Category findAllById(int id){
		return categoryService.findAllById(id);
	}
	@RequestMapping("/categoryAddOrEdit.do")
	public int addOrEdit(Category s){
		return categoryService.addOrEdit(s);
	}
	@RequestMapping("/categoryDel.do")
	public int del(int id){
		return categoryService.del(id);
	}
}
