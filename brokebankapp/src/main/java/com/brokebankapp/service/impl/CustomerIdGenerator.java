package com.brokebankapp.service.impl;

import org.apache.log4j.Logger;

//ID generator for cxid and empid
public class CustomerIdGenerator {
// Will try using matn.random
//Customer ID will be between 50000000-99999999
	private static Logger log = Logger.getLogger(CustomerIdGenerator.class);
	
	public static void main(String[] args) {
		
		int min = 50000000;
		int max = 99999999;
		
		int cxid = (int)(Math.random()*(max - min + 1) + min);
		log.debug(cxid);
		
/*
 * have to create a code for a case when a new random
 * serial is made , it checks with db to see if there is any
 * duplicate cxid, if so, generate a NEW one
 */
//
//		if (cxid == some dbcxid) {
//			
//			//generate new serial
//			
//		} else {
//			
//		}
		
	}

}
