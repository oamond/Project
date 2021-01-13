package com.brokebankapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.brokebankapp.dao.dbutil.BrokeBankdbConnectivity;
import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Customer;
import com.brokebankapp.model.Employee;
import com.brokebankapp.service.BrokeBankCreateAccountService;

public class BrokeBankCreateAccountServiceImpl implements BrokeBankCreateAccountService {
	//account creation for employee and customer
	
	private static Logger log = Logger.getLogger(BrokeBankCreateAccountServiceImpl.class);
	

	@Override
	public Customer CreateCustomer(int cxid, String username, String password, String full_name)
			throws BusinessException {
		try(Connection connection = BrokeBankdbConnectivity.getConnection()) {
			String sql = "insert into maindb.customer(cxid, username, password, full_name) values( ?, ?, ?, ?) ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,cxid);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, full_name);
			preparedStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			log.debug(e.getMessage());
		} 
		return null;
	}

	@Override
	public Employee CreateEmployee(int empid, String username, String password, String empname)
			throws BusinessException {
		try(Connection connection = BrokeBankdbConnectivity.getConnection()){
			String sql = "insert into maindb.employee(empid, username, password, empname) values(?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,empid);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, empname);
			preparedStatement.executeUpdate();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			log.debug(e.getMessage());
			log.debug("ERROR: EmployeeCrudDAOImpl:com.brokebankapp.dao.impl");
		}
		return null;
	}

}
