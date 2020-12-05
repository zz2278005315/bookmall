package com.book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.model.Admin;
import com.book.model.Orders;
import com.book.service.IOrdersService;

@ResponseBody
@Controller
public class OrdersController {

	@Resource
	private IOrdersService ordersService;
	
	@RequestMapping("/OrdersfindAll.do")
	public List<Orders> findAll(){
		return ordersService.findAll();
	}
	
	@RequestMapping("/OrdersfindById.do")
	public Orders findById(int id){
		return ordersService.findById(id);
	}
	@RequestMapping("/Ordersadd.do")
	public int add(Orders a){
		return ordersService.add(a);
	}
	@RequestMapping("/Ordersedit.do")
	public int edit(Orders a){
		return ordersService.edit(a);
	}
	@RequestMapping("/Ordersdel.do")
	public int del(int id){
		return ordersService.del(id);
	}
	
	
}
