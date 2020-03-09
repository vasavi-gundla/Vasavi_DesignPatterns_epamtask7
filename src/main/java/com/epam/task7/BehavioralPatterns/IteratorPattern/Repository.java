package com.epam.task7.BehavioralPatterns.IteratorPattern;

public class Repository implements Container {
	public String names[] = {"Vasavi" , "Harsha" ,"Shivani" , "Kavitha" , "Yaswitha"};

	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	     
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
}
