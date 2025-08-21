package next20To40;

/*
30.	Find Digital Root Problem: Write a program to find the digital root of a number. 
Logic: Keep summing digits until single digit remains. 
Test Case: Input: number = 12345 Output: Digital root = 6 

Process:

Take any positive integer
Add up all its digits
If the result has more than one digit, repeat step 2
Continue until you get a single digit (1-9)

Examples:
For 1234:

1 + 2 + 3 + 4 = 10
1 + 0 = 1
Digital root = 1

 */

public class DigitalRoot {
	
	public static int sumOfNumber(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		return sum;
	}
	
	public static void findDiRoot(int num) {
		while(num>=10) {
			int newSum=sumOfNumber(num);
			System.out.println(num + " -> " + newSum);
            num = newSum;
		}
		System.out.println(num);
		
	}
	
	public static void main(String[] args) {
		findDiRoot(12345);
	}

}
