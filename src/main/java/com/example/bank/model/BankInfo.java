package com.example.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="bankinfo")
@IdClass(primarykeys.class)
public class BankInfo {
   @Id //id가 기본키
   @Column(nullable=false, length=10)
   private String bankid;
   @Id
   @Column(nullable=false, length=10)
   private String branchid;
   @Column(nullable=false, length=255)
   private String banklocation;
   @Column(nullable=false, length=50)
   private String banktelephone;
   @Column(nullable=false, length=255)
   private String bankimg;
   private double banklat;
   private double banklng;
   
      
}
