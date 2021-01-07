package com.brokebankapp.dao.dbutil;

import org.apache.log4j.Logger;

public class BrokeBankdbConnectivityutilService {
	
	private static Logger log = Logger.getLogger(BrokeBankdbConnectivityutilService.class);
	
	public static void main(String[] args) {
		
		if (BrokeBankdbConnectivity.class != null) {
			log.debug("connectivity service, connection success");
			
		}

	}

}
