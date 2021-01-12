package com.brokebankapp.service;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Customer;
import com.brokebankapp.model.Employee;

public interface BrokeBankCreateAccountService {
	
	public Customer CreateCustomer(int cxid, String username, String password, String full_name)throws BusinessException;
	public Employee CreateEmployee(int empid, String username, String password, String empname)throws BusinessException;

}
