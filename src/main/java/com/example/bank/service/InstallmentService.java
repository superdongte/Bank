package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.model.Installment;
import com.example.bank.repository.InstallmentRepository;

@Service
public class InstallmentService {
	@Autowired
	private InstallmentRepository installmentRepository;
	
	public List<Installment>list(){
		return installmentRepository.findAll();
	} 
}
