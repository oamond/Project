package com.brokebankapp.model;

import java.sql.Date;

public class Customer {
	
	private int cxid;
	private String username;
	private String password;
	private int account_id;
	private double balance;
	private String full_name;
	private Date dob;
	
	
	public Customer() {
		
	}
	
	public Customer(int cxid, String username, String password, String full_name) {
		super();
		this.cxid = cxid;
		this.username = username;
		this.password = password;
		this.full_name = full_name;
		
	}


	public int getCxid() {
		return cxid;
	}


	public void setCxid(int cxid) {
		this.cxid = cxid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAccount_id() {
		return account_id;
	}


	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getFull_namel() {
		return full_name;
	}


	public void setFull_namel(String full_namel) {
		this.full_name = full_namel;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Customer [cxid=" + cxid + ", username=" + username + ", password=" + password + ", account_id="
				+ account_id + ", balance=" + balance + ", full_namel=" + full_name + ", dob=" + dob + "]";
	}
	
	
	
	

}
