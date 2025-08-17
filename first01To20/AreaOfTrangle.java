package first01To20;

import java.util.Scanner;

// 1. Finding Area of a Triangle Problem: Write a program to calculate the area of a 
// triangle using base and height. Formula: Area = (base × height) / 2 Test Case: Input: 
// base = 10, height = 5 Output: Area = 25.0

public class AreaOfTrangle {
 // formula for area of trangle = (base*height)/2
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base values");
		double base=sc.nextDouble();
		
		System.out.println("Enter the height");
		double height=sc.nextDouble();
		
		System.out.println("Area of Trangle :: "+(base*height)/2);
		
	}
}
