package next20To40;

/*
22.	Check Perfect Square Problem: Write a program to check if a number is a perfect square. 
Logic: Check if square root is an integer. 
Test Case: Input: number = 16 Output: 16 is a perfect square 
 */

public class PerfectSquare {

	public static void checkPerfectSquare(int num) {
		boolean flag=false;
		for(int i=1;i<=num/2;i++) {
			if(num==(i*i)) {
				flag=true;
				break;
			}
			
		}
		if(flag) System.out.println("Number is Perfect Square..");
		else System.out.println("Number is not perfect Square...");
		
	}
	
	public static void main(String[] args) {
		checkPerfectSquare(20);
	}
}
