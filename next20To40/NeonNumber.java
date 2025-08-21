package next20To40;

/*
34.	Find Neon Number Problem: Write a program to check if a number is a neon number. 
Logic: Sum of digits of square equals the number. 
Test Case: Input: number = 9 Output: 9 is a neon number 

In other words: sum of digits of (n²) = n
Let me show you with examples:
Example 1: 9 (a neon number)

9² = 81
Sum of digits of 81 = 8 + 1 = 9 ✓
Since 9 equals the original number, 9 is a neon number
 */

public class NeonNumber {
	
	public static int sumofDigit(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println("sum of square "+sum);
		return sum;
	}
	
public static void isNeon(int num) {
	int squre=num*num;
	System.out.println("Square "+squre);
	int sumOfDigit=sumofDigit(squre);
	System.out.println(num==sumOfDigit?"Number is Neon number":"Number is not Neon number");
}
public static void main(String[] args) {
	isNeon(8);
}
}
