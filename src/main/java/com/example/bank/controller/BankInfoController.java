package com.example.bank.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.model.BankInfo;
import com.example.bank.service.BankInfoService;

@RestController
@RequestMapping("/location/")
public class BankInfoController {
	@Autowired
	private BankInfoService locateBankService;
	
	@GetMapping("banklist")
	public Map<String, List<BankInfo>>list(){
		Map<String,List<BankInfo>> map = new HashMap<String, List<BankInfo>>();
		map.put("items", locateBankService.list());
		return map;
	}
}
