package next20To40;

/*
36.	Find Harshad Number Problem: Write a program to check if a number is a Harshad number. 
Logic: Number is divisible by sum of its digits. 
Test Case: Input: number = 18 Output: 18 is a Harshad number 
 */

public class HarshadNumber {
	
	public static void isHarshd(int num) {
		int sum=0, temp=num;
		while(temp>0) {
			int digit=temp%10;
			sum+=digit;
			temp/=10;
		}
		if(num%sum==0) System.out.println("Yes it is Harshad number");
		else System.out.println("Not it is Harshad number");
	}
	public static void main(String[] args) {
		isHarshd(18);
	}

}
