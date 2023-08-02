package com.glearning.practice.codingchallange_6;

public class Customer {        // A class Customer is made
	String fullName;
	int age;                  // Declared all the variables along with their data type
		
	public static void main(String[] args) {        //main method is constructed
		
		Customer customer = new Customer();         // Object customer is created
		
		customer.fullName = "Vikas Vohra";          // Assigning values the variables using the customer object
		customer.age = 22;
		
		System.out.println("The Name of the Customer is " + customer.fullName);   // Printing the Name and age of Customer
		System.out.println("The Age of the Customer is " + customer.age);
		
	}

}
