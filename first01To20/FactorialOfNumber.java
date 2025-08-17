package first01To20;

/*
Find Factorial of a Number Problem: Write a program to find the factorial of a number. 
Formula: n! = n × (n-1) × (n-2) × ... × 1 
Test Case: Input: n = 5 Output: Factorial = 120 

 */

public class FactorialOfNumber {
	public void Factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i; // multiply the number upto number using loop and store to fact 
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
	public static void main(String[] args) {
	new FactorialOfNumber().Factorial(7);
	}

}
