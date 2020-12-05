package com.book.dao;

import java.util.List;

import com.book.model.Admin;

public interface IAdminDAO {

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
