package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.mapper.BankInfoMapper;
import com.example.bank.model.BankInfo;

@Service
public class BankInfoServiceImpl implements BankInfoService {
	
	@Autowired
	private BankInfoMapper bankInfoMapper;
	
	@Override
	public List<BankInfo> blist() {
		// TODO Auto-generated method stub
		return bankInfoMapper.blist();
	}

}
