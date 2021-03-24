package com.Week3_Day1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class Example8 {
	
	static Logger logger = Logger.getLogger(Example8.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Debug message");
		logger.info("info message");
		logger.warn("warning message");
		logger.error("error message");
		logger.fatal("fatal message");
	}
}


