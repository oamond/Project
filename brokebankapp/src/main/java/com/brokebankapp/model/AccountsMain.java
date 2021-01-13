package com.brokebankapp.model;

public class AccountsMain {
	
	private int account_id;
	private int cxid;
	private double deposits;
	private double withdrawals;
	private double balance;
	private int transid;
	
	public AccountsMain() {		//basic Constructor
	
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public int getCxid() {
		return cxid;
	}

	public void setCxid(int cxid) {
		this.cxid = cxid;
	}

	public double getDeposits() {
		return deposits;
	}

	public void setDeposits(double deposits) {
		this.deposits = deposits;
	}

	public double getWithdrawals() {
		return withdrawals;
	}

	public void setWithdrawals(double withdrawals) {
		this.withdrawals = withdrawals;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getTransid() {
		return transid;
	}

	public void setTransid(int transid) {
		this.transid = transid;
	}

	@Override
	public String toString() {
		return "AccountsMain [account_id=" + account_id + ", cxid=" + cxid + ", deposits=" + deposits + ", withdrawals="
				+ withdrawals + ", balance=" + balance + ", transid=" + transid + "]";
	}

	
}
