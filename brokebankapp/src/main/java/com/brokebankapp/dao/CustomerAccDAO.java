package com.brokebankapp.dao;

import java.sql.Date;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Customer;

public interface CustomerAccDAO {
	public Customer CustomerId(int cxid) throws BusinessException;
	public Customer CustomerUsername(String username) throws BusinessException;
	public Customer CustomerPassword(String password) throws BusinessException;
	public Customer CustomerAccountId(int account_id) throws BusinessException;
	public Customer CustomerBalance(double balance) throws BusinessException;
	public Customer CustomerName(String full_name) throws BusinessException;
	public Customer CustomerDob(Date dob) throws BusinessException;
}
