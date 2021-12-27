package com.example.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="bankInfo")
public class BankInfo {
	@Id //id가 기본키
	@Column(nullable=false, length=10)
	private String bankid;
	@Column(nullable=false, length=10)
	private String branchid;
	@Column(nullable=false, length=50)
	private String banktel;
	@Column(nullable=false, length=255)
	private String banklocation;
	@Column(nullable=false, length=255)
	private String bankimg;
	private double banklat;
	private double banklng;
	
		
}
