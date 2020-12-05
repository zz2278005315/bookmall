package com.book.dao;

import java.util.List;

import com.book.dto.AddressDTO;
import com.book.model.Address;

public interface IAddressDAO {
		//根据条件查询
		List<Address> findAll(AddressDTO DTO);
		//根据id查询
		Address findAllById(int id);
		//增加
		int add(Address a);
		//删除
		int del(int id);
		//更改
		int edit(Address a);
}
