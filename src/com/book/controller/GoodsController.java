package com.book.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.dto.GoodsDTO;
import com.book.model.Goods;
import com.book.service.IGoodsService;

@ResponseBody
@Controller
public class GoodsController {
	@Resource
	private IGoodsService goodsService;
	@RequestMapping("/goodsFindAll.do")
	public Map findAll(GoodsDTO DTO){
		return goodsService.findAll(DTO);
	}
	@RequestMapping("/goodsFindAllById.do")
	public Goods findAllById(int id){
		return goodsService.findAllById(id);
	}
	@RequestMapping("/goodsAddOrEdit.do")
	public int addOrEdit(Goods s){
		return goodsService.addOrEdit(s);
	}
	@RequestMapping("/goodsDel.do")
	public int del(int id){
		return goodsService.del(id);
	}
}
