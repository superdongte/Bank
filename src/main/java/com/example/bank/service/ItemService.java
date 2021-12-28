package com.example.bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.model.Item;

public interface ItemService {
	public List<Item> findByitem(String icode);
	public Item findByitemid(Long itemid);
}
