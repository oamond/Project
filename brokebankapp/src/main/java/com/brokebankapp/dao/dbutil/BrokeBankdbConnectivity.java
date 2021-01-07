package com.brokebankapp.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BrokeBankdbConnectivity {
	
	private static Connection connection;
	
	
	private BrokeBankdbConnectivity() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/brokebankdb";
		String username = "postgres";
		String password = "postgres";
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
	
	
}

