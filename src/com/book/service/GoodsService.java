package com.book.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.IGoodsDAO;
import com.book.dto.GoodsDTO;
import com.book.model.Goods;

@Service
public class GoodsService implements IGoodsService {

	@Resource
	private IGoodsDAO goodsDAO;
	@Override
	public Map findAll(GoodsDTO DTO) {
		List<Goods> list = goodsDAO.findAll(DTO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}

	@Override
	public Goods findAllById(int id) {
		// TODO Auto-generated method stub
		return goodsDAO.findAllById(id);
	}

	@Override
	public int addOrEdit(Goods u) {
		int n;
		if(u.getGoods_id() > 0){
			n = goodsDAO.edit(u);
		}else{
			n = goodsDAO.add(u);
		}
		return n;
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return goodsDAO.del(id);
	}

}
