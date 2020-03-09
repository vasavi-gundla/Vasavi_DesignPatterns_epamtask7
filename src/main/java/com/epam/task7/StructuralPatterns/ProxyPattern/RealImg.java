package com.epam.task7.StructuralPatterns.ProxyPattern;

public class RealImg implements Image{
	private String fileName;

	   public RealImg(String fileName){
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	   }

	   public void display() {
	      System.out.println("Displaying " + fileName);
	   }

	   private void loadFromDisk(String fileName){
	      System.out.println("Loading " + fileName);
	   }
}
