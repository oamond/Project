package com.brokebankapp.model;

public class SysLogin {
	
	private String username;
	private String password;
	private int cxid;
	private int empid;
	
	public SysLogin() {
		
	}
	
	

	public SysLogin(String username, String password, int cxid, int empid) {
		super();
		this.username = username;
		this.password = password;
		this.cxid = cxid;
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

	public int getCxid() {
		return cxid;
	}

	public void setCxid(int cxid) {
		this.cxid = cxid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "SysLogin [username=" + username + ", password=" + password + ", cxid=" + cxid + ", empid=" + empid
				+ "]";
	}
	
	

}
