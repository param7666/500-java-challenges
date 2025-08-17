package first01To20;

/*
12.	Find Sum of Natural Numbers Problem: Write a program to find the sum of first n natural numbers. 
Formula: Sum = n × (n + 1) / 2 
Test Case: Input: n = 10 Output: Sum = 55 
 */

public class SumOFNaturalNumber {
public static void main(String[] args) {
	int num=10;
	int sum=0;
	for(int i=1;i<=num;i++) { // sum of natural number
		sum+=i;
	}
	System.out.println(sum);
}
}
