package com.glearning.corejava.polymorphism;

public class Polymorphism {
	public int length, breath, height, result;
	
	public void findArea(int l, int b) {
		length = l;
		breath = b;
		result = length * breath;
		System.out.println("The Area of Rectangle is " + result + "cm square");	
	}
	
	public void findArea(int l, int b, int h) {
		length = l;
		breath = b;
		height= h;
		result = length * breath * height;
		System.out.println("The Area of cube is " + result + "cm cube");
	}
	
	public static void main(String[] args) {
		Polymorphism poly = new Polymorphism();
		poly.findArea(5,8);
		poly.findArea(8, 5,8);
	}

}
