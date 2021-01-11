package com.brokebankapp.main;





import java.util.Scanner;

import org.apache.log4j.Logger;

import com.brokebankapp.dao.CustomerAccCrudDAO;
import com.brokebankapp.dao.impl.CustomerAccCrudDAOImpl;



public class BrokeBankMain {
	private static Logger log = Logger.getLogger(BrokeBankMain.class);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to BrokeBank app v1");
		System.out.println("---------------------------");
		log.debug("CustomerMain excuted");
		CustomerAccCrudDAO customer = new CustomerAccCrudDAOImpl();
		customer.createCustomer();
		
		System.out.println("select a number a enter then ");
		System.out.println("please create the following :");
		System.out.println("1) Username ");
		System.out.println("2) Password ");
		System.out.println("3) Full Name ");
		
		try {
		 customer = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	
		switch (customer) {
		case 1:
			System.out.println("enter your username:");
			
			break;
		case 2:
			System.out.println("under construction, please come back later");
			break;
		case 3:
			System.out.println("under construction, pleasse come back later");
			break;
		default:
			System.out.println("Invalid menu entries, please try again");
			break;
		}// while (customer != 3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		CustomerAccCrudDAO dao = new CustomerAccCrudDAOImpl();
//
//		Customer customer = new Customer( 12312, "dev dev", "asdasd", "stephen");
//		try {
//			if (dao.createCustomer(customer) != 0) {
//				System.out.println("customer created");
//			}
//		}catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		
//
	}
	
	
}
