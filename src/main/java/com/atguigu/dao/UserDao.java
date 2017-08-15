package com.atguigu.dao;

import org.apache.log4j.Logger;

public class UserDao {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(UserDao.class);
	
	public static void test1() {
		int i = 0;
		try {
			int j = 10 / i;
		}catch(Exception e) {
			logger.debug(e.getMessage(), e);
		}
	}
	
	public static void test() {
		if (logger.isDebugEnabled()) {
			logger.debug("test() - start");
		}

		int i = 2;
		if (logger.isInfoEnabled()) {
			logger.info("test() - int i=" + i);
		}
		
		int j = 10/i;
		if (logger.isInfoEnabled()) {
			logger.info("test() - int j=" + j);
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("test() - end");
		}
		
		
		
	}
	

	public static void main(String[] args) {
		logger.debug("============debug=========");
		logger.info("=============info==========");
		logger.warn("=============warn==========");
		logger.error("============error=========");
		
		test();
		
		test1();
	}
}
