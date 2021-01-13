package com.brokebankapp.model;

import java.util.Date;

public class SysTransactions {
	
	private int transid;
	private Date date;
	private double amount;
	private String type;
	private int toaccid;
	private int fromaccid;
	
	public SysTransactions() {
		
	}

	public SysTransactions(int transid, Date date, double amount, String type, int toaccid, int fromaccid) {
		super();
		this.transid = transid;
		this.date = date;
		this.amount = amount;
		this.type = type;
		this.toaccid = toaccid;
		this.fromaccid = fromaccid;
	}

	public int getTransid() {
		return transid;
	}

	public void setTransid(int transid) {
		this.transid = transid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getToaccid() {
		return toaccid;
	}

	public void setToaccid(int toaccid) {
		this.toaccid = toaccid;
	}

	public int getFromaccid() {
		return fromaccid;
	}

	public void setFromaccid(int fromaccid) {
		this.fromaccid = fromaccid;
	}

	@Override
	public String toString() {
		return "SysTransactions [transid=" + transid + ", date=" + date + ", amount=" + amount + ", type=" + type
				+ ", toaccid=" + toaccid + ", fromaccid=" + fromaccid + "]";
	}
	
	
	

}
