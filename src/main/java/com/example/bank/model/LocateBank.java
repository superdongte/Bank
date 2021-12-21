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
@Entity(name="locateBank")
public class LocateBank {
	@Id //id가 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bankid;
	@Column(nullable=false, length=50)
	private String bankname;
	@Column(nullable=false, length=255)
	private String banklocation;
	@Column(nullable=false, length=50)
	private String banktelphone;
}
