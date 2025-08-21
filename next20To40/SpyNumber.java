package next20To40;

/*
33.	Check Spy Number Problem: Write a program to check if a number is a spy number. 
Logic: Sum of digits equals product of digits. 
Test Case: Input: number = 123 Output: 123 is not a spy number 

In other words, for a spy number: sum of digits = product of digits
Here are some examples:
Single-digit spy numbers: 0 and 1

For 0: sum = 0, product = 0 ✓
For 1: sum = 1, product = 1 ✓

Multi-digit spy numbers:

22: sum = 2 + 2 = 4, product = 2 × 2 = 4 ✓
123: sum = 1 + 2 + 3 = 6, product = 1 × 2 × 3 = 6 ✓
144: sum = 1 + 4 + 4 = 9, product = 1 × 4 × 4 = 16 ✗ (not a spy number)
 */


public class SpyNumber {

	public static void isSpy(int num) {
		int sum=0;
		int product=1;
		
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			product*=digit;
			num/=10;
		}
		System.out.println(sum==product?"Number is spy":"Number is not spy");
	}
	public static void main(String[] args) {
		isSpy(123);
	}
}
