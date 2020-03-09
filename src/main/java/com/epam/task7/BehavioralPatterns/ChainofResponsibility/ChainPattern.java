package com.epam.task7.BehavioralPatterns.ChainofResponsibility;

public class ChainPattern {
	private static AbstractLogger getChainOfLoggers(){

	      AbstractLogger errorLogger = new ErrorLog(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new FileLog(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLog(AbstractLogger.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;	
	   }

	   public static void main(String[] args) {
	      AbstractLogger loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an example!");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an normal example!");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error example!!");
	   }

}
