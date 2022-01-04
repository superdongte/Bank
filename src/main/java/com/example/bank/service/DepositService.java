package com.example.bank.service;

import java.util.List;

import com.example.bank.model.Deposit;

public interface DepositService {
	public List<Deposit> Deplist();
	public List<Deposit> maxDeposit();
	public List<Deposit> shortDeposit();
	public List<Deposit> longDeposit();
}
