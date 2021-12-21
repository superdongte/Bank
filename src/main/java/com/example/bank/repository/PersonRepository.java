package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
