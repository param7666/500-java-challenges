package next41To60;

/*
49.	Find Ugly Number Problem: Write a program to check if a number is ugly. 
Logic: Only prime factors are 2, 3, and 5. 
Test Case: Input: number = 6 Output: 6 is an ugly number 
 */

public class UglyNumber {
	
	public static void isUgly(int num) {
		int count=0;
		System.out.print("prime factors are = ");
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		if(count<=0 && count>3) System.out.println("\nnumber is not Ugly...");
		else System.out.println("\nnumber is  Ugly....");
	}
	
	public static void main(String[] args) {
		isUgly(7);
	}

}
