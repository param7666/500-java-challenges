package next20To40;

/*
27.	Check Deficient Number Problem: Write a program to check if a number is deficient. 
Logic: Sum of proper divisors is less than the number. 
Test Case: Input: number = 8 
Output: 8 is a deficient number 
 */

public class DeficientNumber {
	
	public static void checkDeficientNumber(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum<num) {
			System.out.println("Number is Deficient ");
		} else System.out.println("number is not Deficient ");
	}

	public static void main(String[] args) {
		checkDeficientNumber(8);
	}
}
