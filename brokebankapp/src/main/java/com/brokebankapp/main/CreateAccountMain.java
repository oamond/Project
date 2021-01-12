package com.brokebankapp.main;

import java.util.Scanner;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.service.BrokeBankCreateAccountService;
import com.brokebankapp.service.impl.BrokeBankCreateAccountServiceImpl;

public class CreateAccountMain {
	
	public static void main(String[] args) throws BusinessException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to BrokeBank Account set-up");
		System.out.println("Please select one of the following");
		System.out.println("-----------------------------------");
		System.out.println("1) Customer Account");
		System.out.println("2) Employee Account");
		BrokeBankCreateAccountService createAccount = new BrokeBankCreateAccountServiceImpl();
		
		int main = Integer.parseInt(sc.nextLine());
		
			switch(main) {
			case 1:
				try{
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Hello Dear Customer, thank you for choosing BrokeBank");
					System.out.println("-----------------------------------------------------");
					System.out.println("To create your account please enter the following ");
					System.out.println("1) create an account ID (8 number combination)");
					System.out.println("2) Create a Username (Minimum of 6 characters");
					System.out.println("3) Create a password (May contain 2 special characters)");
					System.out.println("4) Please Enter your Full Name");
					System.out.println("Press ENTER to begin and after each entry is given.");
					System.out.println("------------------------------------------------------");
					createAccount.CreateCustomer(sc1.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine());
					sc1.close();
					
				}catch (NumberFormatException e) {
					System.out.println(e.getMessage());	
				}
				System.out.println("Customer account Created Succesfully");
				break;
			case 2:
				try {
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Hello Dear Employee, thank you for working at BrokeBank");
					System.out.println("-----------------------------------------------------");
					System.out.println("To create your account please enter the following ");
					System.out.println("1) create an account ID (8 number combination)");
					System.out.println("2) Create a Username (Minimum of 6 characters");
					System.out.println("3) Create a password (May contain 2 special characters)");
					System.out.println("4) Please Enter your Full Name");
					System.out.println("Press ENTER to begin and after each entry is given.");
					System.out.println("------------------------------------------------------");
					createAccount.CreateEmployee(sc1.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine());
					sc1.close();
					
				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Employee Account Created succesfully");
				break;
			default:
				System.out.println("Option out of range, kindly try again");
				break;
			}
		
	}

}
