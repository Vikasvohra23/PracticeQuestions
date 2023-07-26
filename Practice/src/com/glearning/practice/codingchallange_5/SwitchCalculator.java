package com.glearning.practice.codingchallange_5;

import java.util.Scanner;

public class SwitchCalculator {
	public static void main(String[] args) {
		int num1, num2, result;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter yout first Number");
		num1 = in.nextInt();
		System.out.println("Please Enter yout second Number");
		num2 = in.nextInt();
		
		System.out.println("************************");
		System.out.println("Please Choose Which Function do you want to perform");
		System.out.println("1 - - > Addition");
		System.out.println("2 - - > Subtraction");
		System.out.println("3 - - > Multiplication");
		System.out.println("4 - - > Division");
		System.out.println("************************");
		
		int i = in.nextInt();
		switch(i){
		case 1 : result = num1 + num2 ;
		System.out.println(result);
		break;
		case 2 : result = num1 - num2 ;
		System.out.println(result);
		break;
		case 3 : result = num1 * num2 ;
		System.out.println(result);
		break;
		case 4 : if(num2 != 0) {
			result = num1 / num2 ;
			System.out.println(result);
		}
		else {
			System.out.println("Cannot be divided");
		}
		
		break;
		default : System.out.println("Please choose a valid Option");
			
		}
				
		
	}

}
