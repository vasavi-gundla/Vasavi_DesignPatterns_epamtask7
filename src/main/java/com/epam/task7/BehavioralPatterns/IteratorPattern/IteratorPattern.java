package com.epam.task7.BehavioralPatterns.IteratorPattern;

public class IteratorPattern {
	public static void main(String[] args) {
	      Repository namesRepository = new Repository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}
