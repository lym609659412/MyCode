package com.lym.log;

import org.apache.log4j.Logger;

public class LogTest {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(LogTest.class);
	

	public static void main(String[] args) {
		logger.debug("============debug=========");
		logger.info("=============info==========");
		logger.warn("=============warn==========");
		logger.error("============error=========");
	}
}
