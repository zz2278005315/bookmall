package com.book.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.dao.IAddressDAO;
import com.book.dto.AddressDTO;
import com.book.model.Address;
import com.book.model.Address;

@Service
public class AddressService implements IAddressService {

	@Resource
	private IAddressDAO addressDAO;
	@Override
	public Map findAll(AddressDTO DTO) {
		List<Address> list = addressDAO.findAll(DTO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", list.size());
		map.put("data", list);
		return map;
	}

	@Override
	public Address findAllById(int id) {
		// TODO Auto-generated method stub
		return addressDAO.findAllById(id);
	}

	@Override
	public int addOrEdit(Address u) {
		int n;
		if(u.getAddress_id() > 0){
			n = addressDAO.edit(u);
		}else{
			n = addressDAO.add(u);
		}
		return n;
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return addressDAO.del(id);
	}

}
