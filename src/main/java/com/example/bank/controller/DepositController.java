package com.example.bank.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.model.Deposit;
import com.example.bank.service.DepositService;

@RestController
@RequestMapping("/deposit/")
public class DepositController {
	@Autowired
	private DepositService depositService;
	
	@GetMapping("deplist")
	public Map<String,List<Deposit>>Deplist(){
		System.out.println("들어간건지");
		Map<String,List<Deposit>> map = new HashMap<String, List<Deposit>>();
		map.put("insitem", depositService.Deplist());
		System.out.println("값은?"+map);
		return map;
		
	}
	@GetMapping("depmax")
	public Map<String,List<Deposit>>maxDeposit(){
		Map<String,List<Deposit>> map = new HashMap<String, List<Deposit>>();
		map.put("insitem", depositService.maxDeposit());
		return map;
		
	}
	@GetMapping("shortdep")
	public Map<String, List<Deposit>>shortDeposit(){
		Map<String,List<Deposit>> map = new HashMap<String, List<Deposit>>();
		map.put("insitem", depositService.shortDeposit());
		return map;
	}
}
