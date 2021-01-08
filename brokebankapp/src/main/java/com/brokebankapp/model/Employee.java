package com.brokebankapp.model;

public class Employee {
	
	private int empid;
	private String username;
	private String password;
	private String empname;
	private int cxid;
	private int account_id;
	private int transid;
	
	public Employee() {
	
	}
	
	public Employee(int empid, String username, String password, String empname, int cxid, int account_id, int transid) {
		super();
		this.empid = empid;
		this.username = username;
		this.password = password;
		this.empname = empname;
		this.cxid = cxid;
		this.account_id = account_id;
		this.transid = transid;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
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

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getCxid() {
		return cxid;
	}

	public void setCxid(int cxid) {
		this.cxid = cxid;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public int getTransid() {
		return transid;
	}

	public void setTransid(int transid) {
		this.transid = transid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", username=" + username + ", password=" + password + ", empname=" + empname
				+ ", cxid=" + cxid + ", account_id=" + account_id + ", transid=" + transid + "]";
	}

	
	
	

}
