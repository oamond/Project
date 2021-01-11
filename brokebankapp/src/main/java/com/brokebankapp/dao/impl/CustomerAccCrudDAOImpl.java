package com.brokebankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.brokebankapp.dao.CustomerAccCrudDAO;
import com.brokebankapp.dao.dbutil.BrokeBankdbConnectivity;
import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Customer;

public class CustomerAccCrudDAOImpl implements CustomerAccCrudDAO{

	@Override
	public Customer CustomerId(int cxid) throws BusinessException {
		int c = 0;
		try(Connection connection = BrokeBankdbConnectivity.getConnection()){
			
			Customer customer = new Customer();
			String sql = "insert into maindb.customer(cxid) values(?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, cxid);
			c = preparedStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			//System.out.println(e.getMessage());
			throw new BusinessException("Internal ERROR, this is still under construction");
		}
		return null;
	}

	@Override
	public Customer Customerusername(String username) throws BusinessException {
		
		return null;
	}

	@Override
	public Customer CustomerPassword(String password) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer CustomeFullName(String full_name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer CustomeDob(Date dob) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public int createCustomer(Customer customer) throws BusinessException {
//		int c = 0;
//		
//		try(Connection connection = BrokeBankdbConnectivity.getConnection()){
//			String sql = "insert into maindb.customer(cxid, username, password, full_name, dob) values(?, ?, ?, ?, ?)";
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setInt(1, customer.getCxid());
//			preparedStatement.setString(2, customer.getUsername());
//			preparedStatement.setString(3, customer.getPassword());
//			preparedStatement.setString(4, customer.getFull_namel());
//			preparedStatement.setDate(5, customer.getDob());
//		
//			c= preparedStatement.executeUpdate();
//			
//			
//			
//			
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println(e);
//			throw new BusinessException("CrudDAOimpl error");
//		} 
//				
//		return c;
//	}
//
//	



}
