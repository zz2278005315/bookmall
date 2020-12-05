package com.book.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.ICartDAO;
import com.book.model.Cart;

@Service
public class CartService implements ICartService {

	@Resource
	private ICartDAO cartDAO;
	@Override
	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return cartDAO.findAll();
	}

	@Override
	public Cart findById(int id) {
		// TODO Auto-generated method stub
		return cartDAO.findById(id);
	}

	@Override
	public int add(Cart c) {
		// TODO Auto-generated method stub
		return cartDAO.add(c);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return cartDAO.del(id);
	}

	@Override
	public int edit(Cart c) {
		// TODO Auto-generated method stub
		return cartDAO.edit(c);
	}

}
