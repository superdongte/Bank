package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.model.BankInfo;

public interface BankInfoService {
	public List<BankInfo> blist();
	
}
