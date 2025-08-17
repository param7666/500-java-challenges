package next20To40;


/*
28.	Find Fibonacci Number at Position Problem: Write a program to find the nth Fibonacci number.
 Logic: F(n) = F(n-1) + F(n-2), F(0) = 0, F(1) = 1 
Test Case: Input: n = 7 
Output: Fibonacci number = 13 

 */
public class FebbonanciNthNumber {
	
	public static void printNthFebbonanci(int num) {
		// index 0
		int num1=0; // bcz first number start from 0  
		
		//index 1
		int num2=1; // // bcz second number start from 1
		
		
		for(int i=2;i<=num;i++) { // iteration start from 2 beacuse of 0 index to number // for print series upto number
			int sum=num1+num2; // sum of first and second number
			if(num==i) {System.out.print(sum+" ");} // print the sum beacuse of 1st num + 2nd number is 3rd number
			num1=num2; // set num2 on 1st place
			num2=sum; // set sum on 2nd place
		}
	}
	
	public static void main(String[] args) {
		printNthFebbonanci(7);
		
	}

}
