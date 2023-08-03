package com.glearning.corejava;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("Hello Welcome To The Market");
	}
	
    public ConstructorDemo(String item, float price, String status) {
    	System.out.println("The Item is " + item +" Its MRP is " + price + " Rupees, its condition is " + status);
    }
    
    public static void main(String[] args) {
    	ConstructorDemo i1 = new ConstructorDemo();
    	ConstructorDemo i2 =new ConstructorDemo("Bread", 40, "fresh");
    	
    	
    }
   
 
}
     