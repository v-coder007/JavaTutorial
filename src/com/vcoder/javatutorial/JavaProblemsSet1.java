package com.vcoder.javatutorial;

import java.util.Scanner;

public class JavaProblemsSet1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Set 1 - Problem 5

		System.out.println("please enter the number ");
		int num = sc.nextInt();

		System.out.println("Table for " + num);
		System.out.println(num * 1 + " ");
		System.out.println(num * 2 + " ");
		System.out.println(num * 3 + " ");
		System.out.println(num * 4 + " ");
		System.out.println(num * 5 + " ");
		System.out.println(num * 6 + " ");
		System.out.println(num * 7 + " ");
		System.out.println(num * 8 + " ");
		System.out.println(num * 9 + " ");
		System.out.println(num * 10 + " ");

//		Set 1 - Problem 4
		System.out.println("Kindly enter principal amount");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate of interest ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the duration in years");
		int time = sc.nextInt();
		
		double finalAmount = principal* (1 + rate * time);
		System.out.println("Final amount payable is " + finalAmount);

//		Set 1 - Problem 3
		System.out.println("Hello, Please enter you name? ");
		String name = sc.nextLine();
		System.out.println("Hi "+ name + " How are you doing?");	

//		Set 1 - Problem 2
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		double result = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + "  => " + result);

//		Set 1 - Problem 1
		int wnum1 = sc.nextInt();
		int wnum2 = sc.nextInt();

		int wresult = wnum1 + wnum2;
		System.out.println("Sum of " + wnum1 + " and " + wnum2 + "  => " + wresult);

	}

}
