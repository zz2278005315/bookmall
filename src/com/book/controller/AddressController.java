package com.book.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.dto.AddressDTO;
import com.book.model.Address;
import com.book.service.IAddressService;

@ResponseBody
@Controller
public class AddressController {
	@Resource
	private IAddressService addressService;
	@RequestMapping("/addressFindAll.do")
	public Map findAll(AddressDTO DTO){
		return addressService.findAll(DTO);
	}
	@RequestMapping("/addressFindAllById.do")
	public Address findAllById(int id){
		return addressService.findAllById(id);
	}
	@RequestMapping("/addressAddOrEdit.do")
	public int addOrEdit(Address s){
		return addressService.addOrEdit(s);
	}
	@RequestMapping("/addressDel.do")
	public int del(int id){
		return addressService.del(id);
	}
}
