package com.Week3_Day1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example9 {

	static Logger log = Logger.getLogger(Example9.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug message");
		log.info("info message");
		log.error("error message");
		log.warn("warn message");
		log.fatal("fatal message");
	}
}
