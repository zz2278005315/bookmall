package com.book.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.dto.UsersDTO;
import com.book.model.Users;
import com.book.service.IUsersService;
import com.google.gson.Gson;

@ResponseBody
@Controller
public class UsersController {
	@Resource
	private IUsersService usersService;
	@RequestMapping("/findAll.do")
	public Map findAll(UsersDTO DTO){
		return usersService.findAll(DTO);
	}
	@RequestMapping("/findAllById.do")
	public Users findAllById(int id){
		return usersService.findAllById(id);
	}
	@RequestMapping("/addOrEdit.do")
	public int addOrEdit(Users s){
		return usersService.addOrEdit(s);
	}
	@RequestMapping("/del.do")
	public int del(int id){
		return usersService.del(id);
	}
}
