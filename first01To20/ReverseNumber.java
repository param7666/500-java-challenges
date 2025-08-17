package first01To20;

import java.util.Scanner;

/*
 14.	Reverse a Number Problem: Write a program to reverse the digits of a number. 
Logic: Extract digits using modulo and build reverse. 
Test Case: Input: number = 12345 Output: Reversed = 54321 

 */

public class ReverseNumber {

public static void rNumber(int num) {
	int reverse=0;
	
	while(num>0) {
		int digit=num%10;
		reverse=reverse*10+digit;
		num=num/10;
	}
	System.out.println(reverse);
}

public static void main(String[] args) {
	rNumber(12345);
}
}
