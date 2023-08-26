package com.glearning.corejava;

public class InheritanceB extends InheritanceA{
	public float length, breath, areaR;
	
	public void rectangleArea(float l, float b) {
		System.out.println("The Area of Rectangle is length*breath");
		length = l;
		breath = b;
		areaR = length * breath;
		System.out.println("The Area of your Rectangle is "+ areaR + " cm");
				
	}
}

