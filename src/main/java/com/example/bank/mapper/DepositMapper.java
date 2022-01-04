package com.example.bank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bank.model.Deposit;

@Mapper
public interface DepositMapper {
	public List<Deposit> Deplist();
	public List<Deposit> maxDeposit();
	public List<Deposit> shortDeposit();
	public List<Deposit> longDeposit();
}
