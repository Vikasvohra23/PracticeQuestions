package com.glearning.corejava;

public class InheritanceA {
	final float pi = 22/7;
	float radious, areaC;
	
	public void circleArea(float rad) {
		System.out.println("The Area of Circle is pi r^2");
		radious = rad;
		areaC = pi * radious * radious;
		System.out.println("The Area of your circle is " + areaC + " cm");
		
	}

}
