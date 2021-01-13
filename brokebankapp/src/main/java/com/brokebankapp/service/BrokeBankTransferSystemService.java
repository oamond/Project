package com.brokebankapp.service;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.SysTransactions;
//May edit some of this information
public interface BrokeBankTransferSystemService {
	
	public SysTransactions Deposit(String type, Double amount)throws BusinessException;
	public SysTransactions Withdrawal(String type, Double amount)throws BusinessException;
	public SysTransactions Transfer(String type, Double amount)throws BusinessException;

}
