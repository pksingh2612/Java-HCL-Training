package com.Week3_Day2;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class Example1 {
	static Logger log =Logger.getLogger(Example1.class);

	public static void main(String[] args) {
	DOMConfigurator.configure("log4j.xml");
		
 log.debug("debug message");
 log.info("info message");
 log.warn("warn message");
 log.error("error message");
 log.fatal("fatal message");

	}

}