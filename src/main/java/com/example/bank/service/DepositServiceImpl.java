package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.mapper.DepositMapper;
import com.example.bank.model.Deposit;

@Service
public class DepositServiceImpl implements DepositService{
	@Autowired
	private DepositMapper depositMapper;
	
	@Override
	public List<Deposit> maxDeposit() {
		// TODO Auto-generated method stub
		return depositMapper.maxDeposit();
	}

	@Override
	public List<Deposit> Deplist() {
		// TODO Auto-generated method stub
		return depositMapper.Deplist();
	}

	@Override
	public List<Deposit> shortDeposit() {
		// TODO Auto-generated method stub
		return depositMapper.shortDeposit();
	}
	
	

}
