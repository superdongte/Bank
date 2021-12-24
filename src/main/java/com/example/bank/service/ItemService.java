package com.example.bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.model.Item;
import com.example.bank.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	@Transactional
	public List<Item> list(String icode){
		return itemRepository.findByItemList(icode);
	}
}
