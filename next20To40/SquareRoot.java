package next20To40;

/*
21.	Find Square Root Problem: Write a program to find the square root of a number. 
Logic: Use Newton's method or built-in function. 
Test Case: Input: number = 25 Output: Square root = 5.0 

 */

public class SquareRoot {
	
	public static double findSquareRoot(double num) {
		double result=0;
		for(double i=1;i<=num/2;i++) {
			if(i*i==num) {
				return i;
			} else if(i*i<=num) {
				result=i;
			} else {
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(findSquareRoot(125));
	}

}
