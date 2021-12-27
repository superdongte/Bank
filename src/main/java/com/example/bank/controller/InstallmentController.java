package com.example.bank.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.model.Installment;
import com.example.bank.service.InstallmentService;

@RestController
@RequestMapping("/install/")
public class InstallmentController {
	@Autowired
	private InstallmentService installmentService;
	
	@GetMapping("inslist")
	public Map<String,List<Installment>>list(){
		System.out.println("들어간건지");
		Map<String,List<Installment>> map = new HashMap<String, List<Installment>>();
		map.put("insitem", installmentService.list());
		System.out.println("값은?"+map);
		return map;
		
	}
}
