package com.example.bank.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class primarykeys implements Serializable{
   private String bankid;
   private String branchid;
}