package first01To20;

/*
15.	Check Palindrome Number Problem: Write a program to check if a number is a palindrome. 
Logic: Number remains same when reversed. 
Test Case: Input: number = 121 Output: 121 is a palindrome 
 */



public class PalindromeNumber {
	
	public static void checkPalindromeNumber(int num) {
		int temp=num;
		int reverse=0;
		
		while(temp>0) {
			int digit=temp%10;
			reverse=reverse*10+digit;
			temp=temp/10;
		}
		System.out.println(num==reverse?"Number is Palindrome":"Number is not Palindrome");
	}
	
	public static void main(String[] args) {
		checkPalindromeNumber(121);
	}

}
