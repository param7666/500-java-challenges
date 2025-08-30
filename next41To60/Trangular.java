package next41To60;

/*
54.	Check Triangular Number Problem: Write a program to check if a number is triangular. 
Formula: T(n) = n(n+1)/2 
Test Case: Input: number = 10 Output: 10 is a triangular number 
 */
public class Trangular {
	
	public static boolean isTrangular(int num) {
		int tNum=0; // to store Trangular number
		int i=1; // iteration start from 1
		if(num<=0) return false;
		
		while(tNum<num) { // this will run upto Trangular lessthan num
			tNum=i*(i+1)/2; // this will generate Trangular number
			if(tNum==num) return true; // if our number and trangular number is same then it return true
			i++; // increase the number
		}
		return false;
	}
public static void main(String[] args) {
	System.out.println(isTrangular(10)); 
}
	
}
