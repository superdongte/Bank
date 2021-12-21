package com.example.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity(name="item")
public class Item {
	@Id //기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemid;
	@Column(nullable=false, length=50)
	private String itemname;
	private int category;
	private int itemrank;
	private int itemprice;
}
