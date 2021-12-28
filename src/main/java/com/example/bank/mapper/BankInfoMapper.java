package com.example.bank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bank.model.BankInfo;

@Mapper
public interface BankInfoMapper {
	public List<BankInfo> blist();
}
