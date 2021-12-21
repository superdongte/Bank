package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
