package com.example.bank.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.model.Item;
import com.example.bank.service.ItemService;

@RestController
@RequestMapping("/item/")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	//id번호 입력시 정보가 가게됨
	@ResponseBody
	@GetMapping("views/{itemid}")
	public Map<String,Item> Itemname(@PathVariable Long itemid) {
		Map<String,Item> map = new HashMap<String, Item>();
		map.put("items", itemService.findByitemid(itemid));
		return map;
		
	}
	//icode 입력시 정보가 가게됨
	@GetMapping("view/{icode}")
	public Map<String,List<Item>> list(@PathVariable("icode") String icode){
		Map<String,List<Item>> map = new HashMap<String, List<Item>>();
		map.put("items", itemService.findByitem(icode));
		System.out.println("값은?"+map);
		return map;
	}
	@GetMapping("view/fixlist")
	public Map<String,List<Item>> fixitem(){
		Map<String, List<Item>> map = new HashMap<String, List<Item>>();
		map.put("items", itemService.fixitem());
		return map;
	}
	
	
//	@GetMapping("list/{icode}")
//	public String view(@PathVariable("icode") String icode, Model model) {
//		model.addAttribute("icode", itemService.list(icode));
//		return "/item/list";
//	}
	//제목없는거
//	@ResponseBody
//	@GetMapping("view/{icode}")	
//	public List<Item> list(@PathVariable String icode){
//		List<Item> ilist = itemService.list(icode);
//		return ilist;
//	}	
}
