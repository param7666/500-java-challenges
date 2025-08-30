package next41To60;

/*
56.	Check Centered Square Number Problem: Write a program to check if a number is a centered square number. 
Formula: CS(n) = 2n(n-1) + 1 Test Case: 
Input: number = 13 Output: 13 is a centered square number 
 */

public class CenteredNumber {
	
	public static boolean isCentered(int num) {
		if(num<0) return false;
		int centered=0;
		int i=1;
		while(centered<num) {
			centered=2 * i * i - 2 * i + 1;
			if(centered==num) return true;
			i++;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isCentered(13));
	}

}
