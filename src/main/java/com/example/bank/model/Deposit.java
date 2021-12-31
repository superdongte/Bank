package com.example.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity(name="deposit")
public class Deposit {
	@Id //id가 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long depositid;
	@Column(nullable=false, length=45)
	private String bankname;
	@Column(nullable=false, length=80)
	private String depositname;
	private double baserate;
	private double primerate;
	private int dmonth;
	@Column(nullable=false, length=10)
	private String dkind;
}
