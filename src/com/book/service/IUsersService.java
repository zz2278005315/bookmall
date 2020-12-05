package com.book.service;

import java.util.Map;

import com.book.dto.UsersDTO;
import com.book.model.Users;

public interface IUsersService {
	//根据条件查询所有
	Map findAll(UsersDTO DTO);
	//根据id查询
	Users findAllById(int id);
	//查询或修改
	int addOrEdit(Users u);
	//删除
	int del(int id);
}
