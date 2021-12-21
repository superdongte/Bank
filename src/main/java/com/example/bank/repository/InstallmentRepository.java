package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.model.Installment;

public interface InstallmentRepository extends JpaRepository<Installment, Long> {

}
