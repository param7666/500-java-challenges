package first01To20;

/*
16.	Find Sum of Digits Problem: Write a program to find the sum of digits of a number. 
Logic: Extract each digit and add to sum. 
Test Case: Input: number = 12345 Output: Sum of digits = 15 
 */

public class SumOfDigit {
	
	public static void digitSum(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println("Sum of digit "+sum);
	}
	
public static void main(String[] args) {
	digitSum(123456789);
}
}
