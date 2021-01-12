package com.brokebankapp.main;





import java.util.Scanner;

import org.apache.log4j.Logger;

import com.brokebankapp.dao.impl.CustomerCrudDAOImpl;
import com.brokebankapp.exception.BusinessException;



public class BrokeBankCustomerMain {
	private static Logger log = Logger.getLogger(BrokeBankCustomerMain.class);
	
	public static void main(String[] args) throws BusinessException {
		int main = 0;
		CustomerCrudDAOImpl customer = new CustomerCrudDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to BrokeBank app v1");
		System.out.println("---------------------------");
		System.out.println("To create an account please create the following");
		System.out.println("1) a unique 8 number id");
		System.out.println("2) your username");
		System.out.println("3) your password ");
		System.out.println("4) your Full Name");
		System.out.println("Press enter to begin and after each entry");
		System.out.println("---------------------------");
		

		try {
			main = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		
		try {
			Scanner sc1 = new Scanner(System.in);
			customer.CreateCustomer(sc1.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			sc1.close();
			
			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		//log.debug("CustomerMain excuted");
//		do {
//			
//		
//		
//		
//		
//		
//		switch(main) {
//		case 1:
//			//Customer ID- it it supposed to be system generated but for right now, it
//			// will be entered by user. 
//			System.out.println("please enter a unique 8 digit combination");
//			try {
//				Scanner sc1 = new Scanner(System.in);
//				//customer.CustomerId(sc1.nextInt());
//				customer.CreateCustomer(sc1.nextInt(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
//			
//				
//			
//				
//			} catch (NumberFormatException e) {
//				// TODO Auto-generated catch block
//				System.out.println(e.getMessage());
//				
//			}
//			System.out.println("press 2 for username");
//		
//			break;
//		case 2:
//			System.out.println("Enter username, min 6 characters");
//			try {
//				Scanner sc2 = new Scanner(System.in);
//			//	customer.Customerusername(sc2.nextLine());
//				
//				
//			}catch (NumberFormatException e) {
//				System.out.println(e.getMessage());
//			}
//			break;
//		case 3:
//			System.out.println("under construction 3");
//			break;
//		default:
//			System.out.println("Invalid section, please try again");
//			break;
//		} 
//	}while(main != 3);
//	}
	}
}

