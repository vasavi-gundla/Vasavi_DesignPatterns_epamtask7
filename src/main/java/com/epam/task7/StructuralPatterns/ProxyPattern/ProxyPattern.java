package com.epam.task7.StructuralPatterns.ProxyPattern;

public class ProxyPattern {
	public static void main(String[] args) {
	      Image image = new ProxyImage("xyz.png");

	   
	      image.display(); 
	      System.out.println("Successful :)");
	      
	      image.display(); 	
	   }
}
