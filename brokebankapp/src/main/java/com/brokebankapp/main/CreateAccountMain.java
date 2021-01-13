package com.brokebankapp.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.service.BrokeBankCreateAccountService;
import com.brokebankapp.service.impl.BrokeBankCreateAccountServiceImpl;

public class CreateAccountMain {
	
	private static Logger log = Logger.getLogger(CreateAccountMain.class);
	//Main for all services
	//needs work. 
	//need serializer for cxid 
	public static void main(String[] args) throws BusinessException {
	
		Scanner sc = new Scanner(System.in);
		log.debug("Welcome to BrokeBank Account set-up");
		log.debug("Please select one of the following");
		log.debug("-----------------------------------");
		log.debug("1) Customer Account");
		log.debug("2) Employee Account");
		BrokeBankCreateAccountService createAccount = new BrokeBankCreateAccountServiceImpl();
		
		int main = Integer.parseInt(sc.nextLine());
		
			switch(main) {
			case 1:
				try{
					Scanner sc1 = new Scanner(System.in);
					log.debug("Hello Dear Customer, thank you for choosing BrokeBank");
					log.debug("-----------------------------------------------------");
					log.debug("To create your account please enter the following ");
					log.debug("1) create an account ID (8 number combination)");
					log.debug("2) Create a Username (Minimum of 6 characters");
					log.debug("3) Create a password (May contain 2 special characters)");
					log.debug("4) Please Enter your Full Name");
					log.debug("Press ENTER to begin and after each entry is given.");
					log.debug("------------------------------------------------------");
					createAccount.CreateCustomer(sc1.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine());
					sc1.close();
					
				}catch (NumberFormatException e) {
					log.debug(e.getMessage());	
				}
				log.debug("Customer account Created Succesfully");
				break;
			case 2:
				try {
					Scanner sc1 = new Scanner(System.in);
					log.debug("Hello Dear Employee, thank you for working at BrokeBank");
					log.debug("-----------------------------------------------------");
					log.debug("To create your account please enter the following ");
					log.debug("1) create an account ID (8 number combination)");
					log.debug("2) Create a Username (Minimum of 6 characters");
					log.debug("3) Create a password (May contain 2 special characters)");
					log.debug("4) Please Enter your Full Name");
					log.debug("Press ENTER to begin and after each entry is given.");
					log.debug("------------------------------------------------------");
					createAccount.CreateEmployee(sc1.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine());
					sc1.close();
					
				} catch (NumberFormatException e) {
					log.debug(e.getMessage());
				}
				log.debug("Employee Account Created succesfully");
				break;
			default:
				log.debug("Option out of range, kindly try again");
				break;
			}
		
	}

}
