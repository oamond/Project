package com.brokebankapp.service.impl;

import org.apache.log4j.Logger;

public class SysTransactionIdGenerator {
/*
 * similar to the other generators but it will
 * have different parameters for value.
 */
	
	private static Logger log = Logger.getLogger(SysTransactionIdGenerator.class);
	
	public static void main(String[] args) {
		 int min = 100000000;
		 int max = 999999999;
		 
		 int transid = (int)(Math.random()*(max - min + 1 ) + min);
		 log.debug(transid);
		 
		
	}
	
}
