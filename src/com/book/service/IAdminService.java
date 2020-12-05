package com.book.service;

import java.util.List;
import java.util.Map;

import com.book.dto.UsersDTO;
import com.book.model.Admin;
import com.book.model.Users;

public interface IAdminService {
		//查询所有
		List<Admin> findAll();
		//id查询
		Admin findById(int id);
		//增加
		int add(Admin a);
		//删除
		int del(int id);
		//更改
		int edit(Admin a);
}
