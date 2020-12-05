package com.book.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.model.Admin;
import com.book.service.IAdminService;

@ResponseBody
@Controller
public class AdminController {

	@Resource
	private IAdminService adminService;
	
	@RequestMapping("/AdminfindAll.do")
	public List<Admin> findAll(){
		return adminService.findAll();
	}
	
	@RequestMapping("/AdminfindById.do")
	public Admin findById(int id){
		return adminService.findById(id);
	}
	@RequestMapping("/Adminadd.do")
	public int add(Admin a){
		return adminService.add(a);
	}
	@RequestMapping("/Adminedit.do")
	public int edit(Admin a){
		return adminService.edit(a);
	}
	@RequestMapping("/Admindel.do")
	public int del(int id){
		return adminService.del(id);
	}
	
	
}
