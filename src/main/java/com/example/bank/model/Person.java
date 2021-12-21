package com.example.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity(name="person")
public class Person {
	@Id //기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	@Column(nullable=false, length=10)
	private String gender;
	private int  age;
}
