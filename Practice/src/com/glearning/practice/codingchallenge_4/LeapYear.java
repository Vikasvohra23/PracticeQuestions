package com.glearning.practice.codingchallenge_4;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2020;
		
		if (year % 400 == 0) {
			System.out.println(" Leap Year");
		}
		
		else if (year % 100 == 0) {
			System.out.println(" Not a Leap Year");
			}
		
		else if (year % 4 == 0) {
			System.out.println("Leap Year");
			}
		else {
			System.out.println("Not a Leap Year");
		}
		

	}


}
