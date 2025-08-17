package first01To20;

import java.util.Scanner;

/*
Find GCD of Two Numbers Problem: Write a program to find the 
GCD (Greatest Common Divisor) of two numbers. 
Logic: Use Euclidean algorithm. 
Test Case: Input: a = 48, b = 18 Output: GCD = 6 

 */

public class FindGCD {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers ");
	Integer a=sc.nextInt();
	Integer b=sc.nextInt();
	while(b!=0) {
		int temp=b;
		b=a%b;
		a=temp;
	}
	System.out.println(a+" is the GCD");
}
}
