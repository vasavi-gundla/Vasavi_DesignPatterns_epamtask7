package com.epam.task7.BehavioralPatterns.ChainofResponsibility;

public class FileLog extends AbstractLogger {
	public FileLog(int level){
	      this.level = level;
	   }
	   protected void write(String message) {		
	      System.out.println("File::Logger: " + message);
	   }
}
