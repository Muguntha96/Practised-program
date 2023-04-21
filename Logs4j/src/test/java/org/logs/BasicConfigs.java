package org.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class BasicConfigs {
	static Logger log=LogManager.getLogger(BasicConfigs.class);
	@Test
	public void logs() {
		log.debug("Log is debug");
		log.info("Log is info");
		log.warn("Log is warn");
		log.error("Log is error");
		log.fatal("Log is fatal");

	}
		
		
		
	}


