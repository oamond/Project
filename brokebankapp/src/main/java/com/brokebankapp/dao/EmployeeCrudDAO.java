package com.brokebankapp.dao;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Employee;

public interface EmployeeCrudDAO {
	
	public Employee CreateEmployee(int empid, String username, String password, String empname)throws BusinessException;

}
