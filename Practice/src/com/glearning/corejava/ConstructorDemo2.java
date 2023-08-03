package com.glearning.corejava;

public class ConstructorDemo2 {		
	
	       public ConstructorDemo2() { 
	       System.out.println("I am a Default Constructor");
	       }

	       public ConstructorDemo2(int a, float b, String name, char n ) {
	       System.out.println("I am a Parameterized Constructor, I take various arguments as input");
	       System.out.println("The Square of the integer number is " + a*a);
	       System.out.println("The Square of the float number is " + b*b);
	       System.out.println("Entered String is " + name);
	       System.out.println("Entered Charachter is " + n);
	       }
	              
	       public void observations(){ 
	       System.out.println("inside Observations method");
	      }

	  public static void main(String[] args) {
		  ConstructorDemo2 obj = new ConstructorDemo2();
		  ConstructorDemo2 obj1 = new ConstructorDemo2(5, 4, "Vikas Vohra", 'V');
		  obj.observations();
		  
		  

	  

	  } 
}


