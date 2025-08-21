package next41To60;

/*
37.	Check Krishnamurthy Number Problem: Write a program to check if a number is a Krishnamurthy number. 
Logic: Sum of factorial of digits equals the number. 
Test Case: Input: number = 145 Output: 145 is a Krishnamurthy number 

In mathematical terms, for a number with digits d₁, d₂, d₃, ..., dₙ, it's a Krishnamurthy number if:
Number = d₁! + d₂! + d₃! + ... + dₙ!
Examples:
145 is a Krishnamurthy number because:

Digits: 1, 4, 5
1! + 4! + 5! = 1 + 24 + 120 = 145 ✓

 */

public class KrishnamurtiNumber {
	
	public static void iskrishnamurti(int num) {
		int sum=0; // to store sum
		int temp=num; // temp veriable for store num and perform operator on temp
		while(temp>0) { // iterate until temp not become zero
			int digit=temp%10; // get last digit
			System.out.println("digit "+digit); // print last digit
			int fact=1; // varible to store of every digit
			for(int i=1;i<=digit;i++) { // for loop upto digit
				fact*=i; // formula for factorial
				System.out.println("fact of "+digit+" is "+fact); // print the factorial
			}
			sum+=fact; // store and add into sum varible
			System.out.println("sum "+sum);
			temp/=10; // remove the last digit from the temp variable
		}
		System.out.println(num==sum?"number is Krishnamurthy ":"number is not Krishnamurthy"); // check it is num==sum
	}
	public static void main(String[] args) {
		iskrishnamurti(145);
	}
}
