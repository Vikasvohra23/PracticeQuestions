package com.glearning.practice.codingchallange_4;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2020;
		
		if (year % 400 == 0) {
			System.out.println(" Leap Year");
		}
		
		else if (year % 100 == 0) {
			System.out.println(" not a leap year");
			}
		
		else if (year % 4 == 0) {
			System.out.println("leap year");
			}
		else {
			System.out.println("not a leap year");
		}
		

	}


}
