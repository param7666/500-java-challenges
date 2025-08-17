package first01To20;


/*
17.	Count Number of Digits Problem: Write a program to count the number of digits in a number. 
Logic: Keep dividing by 10 until number becomes 0. 
Test Case: Input: number = 12345 Output: Number of digits = 5 
 */


public class NumberCount {
public static void count(int num) {
	int length=0;
	while(num>0) {
		length++;
		num/=10;
	}
	System.out.println(length);
}
public static void main(String[] args) {
	count(123456789);
}
}
