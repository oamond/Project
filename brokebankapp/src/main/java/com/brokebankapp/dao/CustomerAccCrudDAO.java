package com.brokebankapp.dao;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Customer;

public interface CustomerAccCrudDAO {
	
	public int createCustomer(Customer customer) throws BusinessException;

}
