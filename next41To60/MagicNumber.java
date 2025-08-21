package next41To60;

/*
39.	Check Magic Number Problem: Write a program to check if a number is magic. 
Logic: Repeatedly sum digits until single digit; if 1, it's magic. 
Test Case: Input: number = 19 Output: 19 is a magic number 

 */

public class MagicNumber {

	protected static int sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		return sum;
	}
	
	public static void isMagic(int num) {
		while(num>=10) {
			num=sumOfDigit(num);
		}
		boolean result=num==1;
		System.out.println(result?"Number is magic":"number is not magic");
	}
	public static void main(String[] args) {
		isMagic(19);
	}
}
