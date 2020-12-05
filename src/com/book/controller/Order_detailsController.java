package com.book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.model.Admin;
import com.book.model.Order_details;
import com.book.service.IOrder_detailsService;

@ResponseBody
@Controller
public class Order_detailsController {

	@Resource
	private IOrder_detailsService order_detailsService;
	
	@RequestMapping("/Order_detailsfindAll.do")
	public List<Order_details> findAll(){
		return order_detailsService.findAll();
	}
	
	@RequestMapping("/Order_detailsfindById.do")
	public Order_details findById(int id){
		return order_detailsService.findById(id);
	}
	@RequestMapping("/Order_detailsadd.do")
	public int add(Order_details o){
		return order_detailsService.add(o);
	}
	@RequestMapping("/Order_detailsedit.do")
	public int edit(Order_details o){
		return order_detailsService.edit(o);
	}
	@RequestMapping("/Order_detailsdel.do")
	public int del(int id){
		return order_detailsService.del(id);
	}
	
	
}
