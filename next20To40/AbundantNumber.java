package next20To40;

/*
26.	Check Abundant Number Problem: Write a program to check if a number is abundant. 
Logic: Sum of proper divisors is greater than the number. 
num = 12, 
divisors=1,2,3,4,6
sum=1+2+3+4+6=16
sum>num = true (number is abundant)
Test Case: Input: number = 12 
Output: 12 is an abundant number 
 */

public class AbundantNumber {
	
	public static void checkAbundantNumber(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum>num) System.out.println("Number is abundant");
		else System.out.println("number is not abundant");
	}
	
	public static void main(String[] args) {
		checkAbundantNumber(12);
	}

}
