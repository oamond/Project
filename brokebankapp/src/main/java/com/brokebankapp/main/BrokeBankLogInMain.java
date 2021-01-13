package com.brokebankapp.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.service.BrokeBankLogInService;
import com.brokebankapp.service.impl.BrokeBankLogInServiceImpl;
//code for log in main
public class BrokeBankLogInMain {
	
	private static Logger log = Logger.getLogger(BrokeBankLogInMain.class);
	
	public static void main(String[] args) {
		
		BrokeBankLogInService logIn = new BrokeBankLogInServiceImpl(); 
		try {
		Scanner input = new Scanner(System.in);
		log.debug("Log in using your");
		log.debug("1) Username : ");
		log.debug("2) Password : ");
		logIn.CustomerLogIn(input.nextLine(), input.nextLine());
		input.close();
		
//		
//		if(username.equals(username) && password.equals(password)) {
//			System.out.println("You are logged in");
	}  catch (BusinessException e) {
		log.debug(e.getMessage());
	} 
	}
}

