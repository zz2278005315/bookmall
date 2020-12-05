package com.book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.IOrder_detailsDAO;
import com.book.model.Order_details;

@Service
public class Order_detailsService implements IOrder_detailsService {
   @Resource
	private IOrder_detailsDAO order_detailsDAO;
	
	@Override
	public List<Order_details> findAll() {
		// TODO Auto-generated method stub
		return order_detailsDAO.findAll();
	}

	@Override
	public Order_details findById(int id) {
		// TODO Auto-generated method stub
		return order_detailsDAO.findById(id);
	}

	@Override
	public int add(Order_details o) {
		// TODO Auto-generated method stub
		return order_detailsDAO.add(o);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return order_detailsDAO.del(id);
	}

	@Override
	public int edit(Order_details o) {
		// TODO Auto-generated method stub
		return order_detailsDAO.edit(o);
	}

}
