package next41To60;

import java.util.ArrayList;
import java.util.List;

/*
 51.	Find Smith Number Problem: Write a program to check if a number is a Smith number. 
 Logic: Sum of digits equals sum of digits of prime factors. 
 Test Case: Input: number = 22 Output: 22 is a Smith number 
 
 22 is a Smith number:

Prime factorization: 22 = 2 × 11
Sum of digits of 22: 2 + 2 = 4
Sum of digits of prime factors: 2 + (1 + 1) = 4
Since 4 = 4, it's a Smith number

 */

public class SmithNumber {
	
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		if(num<=3) return true;
		if(num%2==0 || num%3==0) return false;
		for(int i=5;i*i<=num;i+=6) {
			if(num%i==0 || num%(i*2)==0) {
				return false;
			}
		}
		return true;
	}

	// sum of prime factor
	public static int sumOfPrimeFactor(int num) {
		int sum=0;
		int org=num;
		while(num%2==0) {
			sum+=sumOfDigit(2);
			num/=2;
		}
		for(int i=3;i*i<=num;i+=2) {
			while(num%i==0) {
				sum+=sumOfDigit(i);
				num/=i;
			}
		}
		if(num>2) {
			sum+=sumOfDigit(num);
		}
		return sum;
	}
	
	
	public static int sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
	public static boolean isSmith(int num) {
		if(num<=1 || isPrime(num)) {
			return false;
		}
		int digitSum=sumOfDigit(num);
		int primeDigitSum=sumOfPrimeFactor(num);
		return digitSum==primeDigitSum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isSmith(22)?"Number is Smith":"Number is not smith");
	}
}
