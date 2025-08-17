package first01To20;

/*
Check Leap Year Problem: Write a program to check if a year is a leap year. 
Logic: Divisible by 4, but not by 100 unless also divisible by 400. 
Test Case: Input: year = 2024 Output: 2024 is a leap year 

 */


public class CheckLeapYear {

	public void leapYear(int year) {
		if(year%4==0 && year%100!=0 ||( year%400==0)) {
			System.out.println(year+" Year is Leap Year");
		}
		else System.out.println(year+" Year is not Leap Year");

	}
	
	public static void main(String[] args) {
		new CheckLeapYear().leapYear(2020);
	}
}
