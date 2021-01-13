package com.brokebankapp.service.impl;

import org.apache.log4j.Logger;

public class EmployeeIdGenerator {
//Same as CustomerIdGen
//EMPID will be between 10000000-49999999
	private static Logger log = Logger.getLogger(EmployeeIdGenerator.class);
	
	public static void main(String[] args) {
		
		int min = 10000000;
		int max = 49999999;
		
		int empid = (int)(Math.random()*(max - min + 1) + min);
		log.debug(empid);
		
	}

}
