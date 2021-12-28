package com.example.bank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bank.model.Installment;

@Mapper
public interface InstallmentMapper {
	public List<Installment> inslist();
	public List<Installment> maxinstall();
}
