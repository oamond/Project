package com.brokebankapp.main;





import java.util.Scanner;

import org.apache.log4j.Logger;

import com.brokebankapp.dao.impl.CustomerAccCrudDAOImpl;
import com.brokebankapp.exception.BusinessException;



public class BrokeBankMain {
	private static Logger log = Logger.getLogger(BrokeBankMain.class);
	
	public static void main(String[] args) throws BusinessException {
		int main = 0;
		CustomerAccCrudDAOImpl customer = new CustomerAccCrudDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to BrokeBank app v1");
		System.out.println("---------------------------");
		System.out.println("you will need to create customerID, please press 1");
		//log.debug("CustomerMain excuted");
		do {
			
		
		
		
		
		try {
			main = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		
		switch(main) {
		case 1:
			//Customer ID- it it supposed to be system generated but for right now, it
			// will be entered by user. 
			System.out.println("please enter a unique 8 digit combination");
			try {
				Scanner sc1 = new Scanner(System.in);
				customer.CustomerId(sc1.nextInt());
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				
			}
			System.out.println("press 2 for username");
		
			break;
		case 2:
			System.out.println("Enter username, min 6 characters");
			break;
		case 3:
			System.out.println("under construction 3");
			break;
		default:
			System.out.println("Invalid section, please try again");
			break;
		} 
	}while(main != 3);
	}
}

