package first01To20;

import java.util.Scanner;

// Find Maximum of Three Numbers Problem: Write a program to find the maximum 
// among three numbers. Logic: Compare numbers using conditional statements. Test 
// Case: Input: a = 15, b = 25, c = 10 Output: Maximum = 25 
public class MamimumOf3Number {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)) {
	System.out.println("Enter 3 numbers ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b && a >c ) System.out.println(a+" is maximum");
	else if(b>c ) System.out.println(b+" is maximum ");
	else System.out.println(c+ " is maximum ");
	} catch(Exception e) {
		System.out.println("Wrong input.....");
		System.out.println("Provide only integer values .....2.5");
	}
}
}
