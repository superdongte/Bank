package com.example.bank.service;

import java.util.List;

import com.example.bank.model.Installment;

public interface InstallmentService {
	public List<Installment> inslist();
	public List<Installment> maxinstall();
	
}
