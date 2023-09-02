package com.glearning.corejava.polymorphism;

public class Run_time_polymorphism {
	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new B();
		obj.Car();
		obj1.Car();
	}

}
