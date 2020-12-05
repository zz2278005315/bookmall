package com.book.service;

import java.util.Map;

import com.book.dto.AddressDTO;
import com.book.model.Address;

public interface IAddressService {
	//根据条件查询所有
	Map findAll(AddressDTO DTO);
	//根据id查询
	Address findAllById(int id);
	//查询或修改
	int addOrEdit(Address u);
	//删除
	int del(int id);
}
