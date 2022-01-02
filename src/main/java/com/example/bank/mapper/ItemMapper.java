package com.example.bank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bank.model.Item;

@Mapper
public interface ItemMapper {
	public List<Item> findByitem(String icode);
	public Item findByitemid(Long itemid);
	public List<Item> fixitem();
}
