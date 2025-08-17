package first01To20;

/*
11.	Check Perfect Number Problem: Write a program to check if a number is perfect. 
Logic: A perfect number equals the sum of its proper divisors not itself number. 
Test Case: Input: number = 28 Output: 28 is a perfect number 

 */

public class PerfectNumber {
	
	void findPerfectNUmber(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) { // do not add number it self so num/2
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) System.out.println(num+ " is Perfect Number");
		else System.out.println(num+" is Not Perfect");
	}
	
	public static void main(String[] args) {
		new PerfectNumber().findPerfectNUmber(28);
	}

}
