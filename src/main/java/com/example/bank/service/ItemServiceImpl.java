package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.mapper.ItemMapper;
import com.example.bank.model.Item;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> findByitem(String icode) {
		// TODO Auto-generated method stub
		return itemMapper.findByitem(icode);
	}

	@Override
	public Item findByitemid(Long itemid) {
		// TODO Auto-generated method stub
		return itemMapper.findByitemid(itemid);
	}

	@Override
	public List<Item> fixitem() {
		// TODO Auto-generated method stub
		return itemMapper.fixitem();
	}

}
