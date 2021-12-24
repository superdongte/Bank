package com.example.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="item")
public class Item {
	@Id //기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemid;
	private String icode;
	@Column(nullable=false, length=150)
	private String itemname;
	private int itemprice;
	private String image;
	@ManyToOne
	@JoinColumn(name="pid")
	private Person person;
	
}
