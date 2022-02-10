package com.fund_for_change.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	private String accountType;
	private double balance;
	
	@ManyToOne
	private User user;
	
	public Account(int accountId, String accountType, double balance) {
 		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public Account() {
	
	}

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance + ", user="
				+ user + "]";
	}
	
	
} 
