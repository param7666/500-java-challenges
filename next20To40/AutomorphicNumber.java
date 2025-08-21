package next20To40;

/*
35.	Check Automorphic Number Problem: Write a program to check if a number is automorphic. 
Logic: Square of number ends with the number itself. 
Test Case: Input: number = 25 Output: 25 is an automorphic number 
 */

public class AutomorphicNumber {

	public static void isAutomorphic(int num) {
		long square=(long)num*num; // square
		System.out.println(square);
		String strNum=String.valueOf(num); // number converted into string
		System.out.println(strNum);
		String strSquare=String.valueOf(square); // square converted into String
		System.out.println(strSquare);
		boolean result= strSquare.endsWith(strNum); // check square ends with number
		System.out.println(result); 
		System.out.println(result?"Automorphic number ":"not Automorphic number");
	}
	public static void main(String[] args) {
		isAutomorphic(25);
	}
}
