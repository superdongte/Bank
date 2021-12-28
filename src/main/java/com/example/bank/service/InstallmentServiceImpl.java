package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.mapper.InstallmentMapper;
import com.example.bank.model.Installment;

@Service
public class InstallmentServiceImpl implements InstallmentService{
	@Autowired
	private InstallmentMapper installmentMapper;
	
	@Override
	public List<Installment> maxinstall() {
		// TODO Auto-generated method stub
		return installmentMapper.maxinstall();
	}

	@Override
	public List<Installment> inslist() {
		// TODO Auto-generated method stub
		return installmentMapper.inslist();
	}
	
	

}
