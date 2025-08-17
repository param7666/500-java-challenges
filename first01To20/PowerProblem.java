package first01To20;

/*
19.	Find Power of a Number Problem: Write a program to calculate power of a number. 
Formula: result = base^exponent 
Test Case: Input: base = 2, exponent = 3 Output: Power = 8 

 */

public class PowerProblem {
	public static void findPower(int base, int exponant) {
		int result=1;
		for(int i=1;i<=exponant;i++) {
			result*=base;
		}
		System.out.println(result);
		
	}
public static void main(String[] args) {
	findPower(5, 3);
}
}
