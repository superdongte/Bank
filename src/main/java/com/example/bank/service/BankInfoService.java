package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.model.BankInfo;
import com.example.bank.repository.BankInfoRepository;

@Service
public class BankInfoService {
	
	@Autowired
	private BankInfoRepository locateBankRepository;
	
	public List<BankInfo> list() {
		
		return locateBankRepository.findAll();
	}

}
