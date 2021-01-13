package com.brokebankapp.service;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.SysLogin;

public interface BrokeBankLogInService {
	//Working but needs more work
	public SysLogin CustomerLogIn(String username, String password)throws BusinessException;
	public SysLogin EmployeeLogIn(String username, String password)throws BusinessException;

}
