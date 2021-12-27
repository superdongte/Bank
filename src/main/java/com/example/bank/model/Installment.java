package com.example.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity(name="installment")
public class Installment {
	@Id //id가 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long installid;
	@Column(nullable=false, length=45)
	private String bankname;
	@Column(nullable=false, length=80)
	private String installname;
	private double baserate;
	private double primerate;
	private int insmonth; 
}
