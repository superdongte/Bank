package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.model.BankInfo;


public interface BankInfoRepository extends JpaRepository<BankInfo, Long> {

}
