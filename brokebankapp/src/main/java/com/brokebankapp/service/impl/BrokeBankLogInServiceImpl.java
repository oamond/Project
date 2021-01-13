package com.brokebankapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.brokebankapp.dao.dbutil.BrokeBankdbConnectivity;
import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.SysLogin;
import com.brokebankapp.service.BrokeBankLogInService;

public class BrokeBankLogInServiceImpl implements BrokeBankLogInService {
	//Set for customer login verificantion 
	private static Logger log = Logger.getLogger(BrokeBankLogInServiceImpl.class);

	@Override
	public SysLogin CustomerLogIn(String username, String password) throws BusinessException {
		SysLogin customer = null;
		try(Connection connection = BrokeBankdbConnectivity.getConnection()){
			String sql = "select full_name, cxid from maindb.customer where username = ? and password = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, resultSet.getString(password));
			preparedStatement.executeUpdate();
		}else {
			
		}
			
		} catch (ClassNotFoundException | SQLException e) {
			log.debug(e.getMessage());
			log.debug("ERROR BrokeBankLogInServiceImpl:com.brokebankapp.service.impl:CustomerLogIn");
		} 
		return customer;
	}

	@Override
	public SysLogin EmployeeLogIn(String username, String password) throws BusinessException {
		SysLogin employee = null;
		try(Connection connection = BrokeBankdbConnectivity.getConnection()){
			String sql = "select * from maindb.employee where username = ? and password = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			log.debug(e.getMessage());
			log.debug("ERROR BrokeBankLogInServiceImpl:com.brokebankapp.service.impl:EmployeeLogIn");
		} 
		return employee;
	}

}
