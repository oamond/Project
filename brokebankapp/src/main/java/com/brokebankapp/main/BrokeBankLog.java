package com.brokebankapp.main;

import org.apache.log4j.Logger;

import com.brokebankapp.service.BrokeBankLogService;

public class BrokeBankLog {
	
	private static Logger log = Logger.getLogger(BrokeBankLog.class);
	
	public static void main(String[] args) {
		
//		log.trace("TRACE from BrokeBankLog");
//		log.debug("DEBUG from BrokeBankLog");
//		log.info("INFO from BrokeBankLog");
//		log.warn("WARN from BrokeBankLog");
//		log.error("ERROR from BrokeBankLog");
//		log.fatal("FATAL from BrokeBankLog");
		
		BrokeBankLogService service = new BrokeBankLogService();
		service.brokeLog();
		
	}
	

}
