package com.book.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.IUsersDAO;
import com.book.dto.UsersDTO;
import com.book.model.Users;
import com.google.gson.Gson;

@Service
public class UsersService implements IUsersService {

	@Resource
	private IUsersDAO usersDAO;
	@Override
	public Map findAll(UsersDTO DTO) {
		List<Users> list = usersDAO.findAll(DTO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}

	@Override
	public Users findAllById(int id) {
		// TODO Auto-generated method stub
		return usersDAO.findAllById(id);
	}

	@Override
	public int addOrEdit(Users u) {
		int n;
		if(u.getUser_id() > 0){
			n = usersDAO.edit(u);
		}else{
			n = usersDAO.add(u);
		}
		return n;
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return usersDAO.del(id);
	}

}
