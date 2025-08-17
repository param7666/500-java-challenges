package first01To20;

/*
18.	Check Strong Number Problem: Write a program to check if a number is a strong number. 
Logic: Sum of factorial of digits equals the number. 
Test Case: Input: number = 145 Output: 145 is a strong number 
 */

public class StrongNumber {
public static void checkStrongNumber(int num) {

	int temp=num;
	int sum=0;
	while(temp>0) {
		int digit=temp%10;
		sum+=factorial(digit);
		temp/=10;
	}
	System.out.println(sum==num?"Number is Strong":"Number is not strong");
	
}

public static int factorial(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	return fact;
}

public static void main(String[] args) {
	checkStrongNumber(146);
}

}
