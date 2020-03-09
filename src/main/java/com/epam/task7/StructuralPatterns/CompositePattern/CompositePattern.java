package com.epam.task7.StructuralPatterns.CompositePattern;

public class CompositePattern {
	public static void main(String[] args) {
		   
	      Employee CEO = new Employee("Vasavi","CEO", 90000);

	      Employee CTO = new Employee("Harsha","CTO", 80000);

	      Employee CIO = new Employee("Shivani","CIO", 30000);

	      Employee clerk1 = new Employee("Yaswitha","Marketing", 20000);
	      Employee clerk2 = new Employee("Kavitha","Marketing", 20000);

	      Employee salesExecutive1 = new Employee("Chandrakala","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Jaya","Sales", 10000);

	      CEO.add(CTO);
	      CEO.add(CIO);

	      CTO.add(salesExecutive1);
	      CTO.add(salesExecutive2);

	      CIO.add(clerk1);
	      CIO.add(clerk2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      
	      for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }		
	   }
}
