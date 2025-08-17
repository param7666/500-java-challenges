package first01To20;

import java.util.Scanner;

/*
Check Prime Number Problem: Write a program to check if a number is prime. 
Logic: A prime number is divisible only by 1 and itself. 
Test Case: Input: number = 17 
Output: 17 is prime
 */

public class PrimeNumber2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number  ");
	double number=sc.nextDouble();
	int div=0;
	if(number<1) System.out.println(number+" is not prime"); // 1 is always not prime 
	else {
	for(int i=1;i<=number;i++) {  // check divisors upto numbers values 
		if(number%i==0) { // check divisior
			div++; // if number divisin then increase the value
		}
	}
	if(div==2) System.out.println(number+" is Prime");
	else System.out.println(number+" is not Prime");
	}
	
}
}
