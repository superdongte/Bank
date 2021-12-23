package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.model.LocateBank;
import com.example.bank.repository.LocateBankRepository;

@Service
public class LocateBankService {
	
	@Autowired
	private LocateBankRepository locateBankRepository;
	
	public List<LocateBank> list() {
		
		return locateBankRepository.findAll();
	}

}
