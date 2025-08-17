package first01To20;

import java.util.Scanner;

// Check Even or Odd Number Problem: Write a program to check if a given number is 
// even or odd. Logic: A number is even if divisible by 2, otherwise odd. Test Case: Input: 
// number = 7 Output: 7 is odd


public class CheckEvenOrOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 numbers");
	int num=sc.nextInt();
	if(num%2==0) System.out.println("Number is even");
	else System.out.println(num+" Number is Odd");
}
}
