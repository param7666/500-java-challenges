package next20To40;

import java.util.HashSet;
import java.util.Set;

/*
Check Happy Number Problem: Write a program to check if a number is happy. 
Logic: Replace number by sum of squares of digits until 1 or cycle. Test Case: Input: 
number = 19 Output: 19 is a happy number 
 */

public class HappyNumber {
	
	public static int getSumOfSquare(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=digit*digit;
			digit/=num;
		}	
		return sum;
	}
	
	public static boolean isHappy(int num) {
		Set<Integer> set=new HashSet<Integer>();
		while(num!=1 && !set.contains(num)) {
			set.add(num);
			num=getSumOfSquare(num);
		}
		return num==1;
	}

	public static void main(String[] args) {
		if(isHappy(19)) System.out.println("Yes it is Happy number");
		else System.out.println("Yes it is not Happy number");
	}
}
