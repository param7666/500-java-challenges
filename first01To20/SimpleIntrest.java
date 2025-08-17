package first01To20;

import java.util.Scanner;

/*
Calculate Simple Interest Problem: Write a program to calculate simple interest. 

Formula: SI = (Principal × Rate × Time) / 100 Test Case: Input: P = 1000, R = 5, T = 2 

Output: Simple Interest = 100.0 
 */


public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle values ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate of Interest  ");
		double r=sc.nextDouble();
		System.out.println("Enter the Time ");
		double t=sc.nextDouble();
		
		System.out.println("Simple Intrest is  "+(p*r*t)/100); // formula 
	}

}
