package com.book.dao;

import java.util.List;

import com.book.dto.UsersDTO;
import com.book.model.Users;

public interface IUsersDAO {
	//根据条件查询
	List<Users> findAll(UsersDTO DTO);
	//根据id查询
	Users findAllById(int id);
	//添加
	int add(Users u);
	//修改
	int edit(Users u);
	//删除
	int del(int id);
}
