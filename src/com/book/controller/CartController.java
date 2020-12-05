package com.book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.model.Cart;
import com.book.service.ICartService;

@ResponseBody
@Controller
public class CartController {

	@Resource
	private ICartService cartService;
	
	@RequestMapping("/CartfindAll.do")
	public List<Cart> findAll(){
		return cartService.findAll();
	}
	
	@RequestMapping("/CartfindById.do")
	public Cart findById(int id){
		return cartService.findById(id);
	}
	@RequestMapping("/Cartadd.do")
	public int add(Cart c){
		return cartService.add(c);
	}
	@RequestMapping("/Cartedit.do")
	public int edit(Cart c){
		return cartService.edit(c);
	}
	@RequestMapping("/Cartdel.do")
	public int del(int id){
		return cartService.del(id);
	}
	
	
}
