package com.glearning.corejava;

public class Area {
 final float pi = 22/7;
 public Area(int r) {
	 System.out.println("Area of this Circle is " + pi*r*r);
 }
 
 public static void main(String[] args) {
	 Area obj = new Area(8);
	 
 }
 
}
