package com.brokebankapp.service;

import org.apache.log4j.Logger;

public class BrokeBankLogService {
	
	private static Logger log = Logger.getLogger(BrokeBankLogService.class);
	
	public void brokeLog() {
		log.info("hello from log service brokeLog()");
		log.debug("bye bye from log service brokeLog()");
	}

}
