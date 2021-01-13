package com.brokebankapp.service.impl;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.SysTransactions;
import com.brokebankapp.service.BrokeBankTransferSystemService;

public class BrokeBankTransferSystemServiceImpl implements BrokeBankTransferSystemService {
//implement this and call in a main service
//Need serializer implementation for transaction ID, not here yet.
	@Override
	public SysTransactions Deposit(String type, Double amount) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysTransactions Withdrawal(String type, Double amount) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysTransactions Transfer(String type, Double amount) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
