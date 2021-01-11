package com.brokebankapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.brokebankapp.dao.CustomerAccDAO;
import com.brokebankapp.dao.dbutil.BrokeBankdbConnectivity;
import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Customer;


public class CustomerAccDAOImpl implements CustomerAccDAO {

	@Override
	public Customer CustomerId(int cxid) throws BusinessException {
		int c = 0;
		System.out.println("CustomerId in DAO.");
		try(Connection connection = BrokeBankdbConnectivity.getConnection()) {
			String sql = "insert into maindb.customer(username, password, full_name, dob) values (?, ?, ?, ?) ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
		}  catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer CustomerUsername(String username) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer CustomerPassword(String password) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer CustomerAccountId(int account_id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer CustomerBalance(double balance) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer CustomerName(String full_name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer CustomerDob(Date dob) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
