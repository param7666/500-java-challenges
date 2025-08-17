package first01To20;

import java.util.Scanner;

/*
Find LCM of Two Numbers Problem: Write a program to find the LCM (Least Common Multiple) 
 of two numbers. 
 Formula: LCM = (a × b) / GCD(a, b) 
 Test Case: Input: a = 12, b = 18 Output: LCM = 36 
 */


public class FindLCM {
	public static int gcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			 b=a%b;
			 a=temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("LCM of "+a+" and "+b+" is "+(a*b)/gcd(a,b));
		
		
	}

}
