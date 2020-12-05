package com.book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.IOrdersDAO;
import com.book.model.Orders;

@Service
public class OrdersService implements IOrdersService {
	@Resource
	private IOrdersDAO ordersDAO;
	
	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return ordersDAO.findAll();
	}

	@Override
	public Orders findById(int id) {
		// TODO Auto-generated method stub
		return ordersDAO.findById(id);
	}

	@Override
	public int add(Orders a) {
		// TODO Auto-generated method stub
		return ordersDAO.add(a);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return ordersDAO.del(id);
	}

	@Override
	public int edit(Orders a) {
		// TODO Auto-generated method stub
		return ordersDAO.edit(a);
	}


}
