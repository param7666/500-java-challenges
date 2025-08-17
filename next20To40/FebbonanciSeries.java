package next20To40;

/*
The Fibonacci series is a famous sequence of numbers where each number is the sum of the two preceding numbers. It typically starts with 0 and 1.
The sequence looks like this:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...
How it works:

Start with 0 and 1
Add them: 0 + 1 = 1
Add the last two: 1 + 1 = 2
Add the last two: 1 + 2 = 3
Add the last two: 2 + 3 = 5
And so on...

Mathematical formula:
F(n) = F(n-1) + F(n-2), where F(0) = 0 and F(1) = 1
 */

public class FebbonanciSeries {
	
	public static void printFebbonanci(int num) {
		int num1=0; // bcz first number start from 0
		
		if(num>=1)System.out.print(num1+" "); // check input number is num>=1 for print first number
		
		int num2=1; // // bcz second number start from 1
		
		if(num>=2)System.out.print(num2+" "); // check input number is num>=1 for print first number
		
		for(int i=3;i<=num;i++) { // iteration start from 3 to number // for print series upto number
			int sum=num1+num2; // sum of first and second number
			System.out.print(sum+" "); // print the sum beacuse of 1st num + 2nd number is 3rd number
			num1=num2; // set num2 on 1st place
			num2=sum; // set sum on 2nd place
		}
	}
	public static void main(String[] args) {
		printFebbonanci(10);
	}

}
