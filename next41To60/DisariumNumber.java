package next41To60;

/*
38.	Find Disarium Number Problem: Write a program to check if a number is a disarium number. 
Logic: Sum of digits raised to power of their position equals number. 
Test Case: Input: number = 175 Output: 175 is a disarium number 

In mathematical terms, for a number with digits d₁, d₂, d₃, ..., dₙ at positions 1, 2, 3, ..., n:
Number = d₁¹ + d₂² + d₃³ + ... + dₙⁿ
Examples:
135 is a Disarium number because:

Digits: 1 (position 1), 3 (position 2), 5 (position 3)
1¹ + 3² + 5³ = 1 + 9 + 125 = 135 ✓

89 is a Disarium number because:

Digits: 8 (position 1), 9 (position 2)
8¹ + 9² = 8 + 81 = 89 ✓
 */

public class DisariumNumber {
	
	public static int power(int base, int exp) {
		int result=1;
		for(int i=0;i<exp;i++) {
			result*=base;
		}
		return result;
	}

	public static void isDisarium(int num) {
		String str=String.valueOf(num);
		int sum=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			int digit=Character.getNumericValue(str.charAt(i));
			sum+=power(digit,i+1);
		}
		if(sum==num) System.out.println(num+" is Disarium Number");
		else System.out.println(num+" is Disarium not Number");
	}
	
	public static void main(String[] args) {
		isDisarium(89);
	}
}
