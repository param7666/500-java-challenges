package next20To40;

/*
31.	Check Buzz Number Problem: Write a program to check if a number is a buzz number. 
Logic: Divisible by 7 or ends with 7. 
Test Case: Input: number = 49 Output: 49 is a buzz number 
 */

public class BuzzNumber {
	
	// method to get last digit of number
	public static int lastDigit(int num) {
		
		int digit=num%10;
		//System.out.println(digit);
		return digit;
	}
	
	// method to check number is buzz or not
	public static void checkBuzz(int num) {
		if(num%7==0 ||lastDigit(num)==7) {
			System.out.println(num+" is Buzz Number");
		}
		else {
			System.out.println("Not a Buzz Number.....");
		}
	}
	
	public static void main(String[] args) {
		checkBuzz(47);
	}

}
