package com.brokebankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.brokebankapp.dao.EmployeeCrudDAO;
import com.brokebankapp.dao.dbutil.BrokeBankdbConnectivity;
import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Employee;

public class EmployeeCrudDAOImpl implements EmployeeCrudDAO {

	@Override
	public Employee CreateEmployee(int empid, String username, String password, String empname) throws BusinessException {
		
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
			System.out.println(e.getMessage());
			System.out.println("ERROR: EmployeeCrudDAOImpl:com.brokebankapp.dao.impl");
		} 
		return null;
	}

}
