package com.example.bank.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.model.LocateBank;
import com.example.bank.service.LocateBankService;

@RestController
@RequestMapping("/location/")
public class LocateBankController {
	@Autowired
	private LocateBankService locateBankService;
	
	@GetMapping("banklist")
	public Map<String, List<LocateBank>>list(){
		Map<String,List<LocateBank>> map = new HashMap<String, List<LocateBank>>();
		map.put("bdatas", locateBankService.list());
		return map;
	}
}
