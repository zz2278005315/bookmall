package com.book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.IAdminDAO;
import com.book.model.Admin;

@Service
public class AdminService implements IAdminService {
     @Resource
	private IAdminDAO adminDAO;
	
	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminDAO.findAll();
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return adminDAO.findById(id);
	}

	@Override
	public int add(Admin a) {
		// TODO Auto-generated method stub
		return adminDAO.add(a);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return adminDAO.del(id);
	}

	@Override
	public int edit(Admin a) {
		// TODO Auto-generated method stub
		return adminDAO.edit(a);
	}

}
