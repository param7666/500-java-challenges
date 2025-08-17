package first01To20;
// find the minimum of 3 numbers
/*
 If (num1 > num2) AND (num1 > num3)
    max = num1
Else if (num2 > num3)
    max = num2
Else
    max = num3
    
 */
import java.util.Scanner;

public class MinimumOf3Numbers {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)) {
		System.out.println("Enter 3 Integer values  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b && a<c) System.out.println(a+" is minimum  ");
		else if(b<c) System.out.println(b+ " is minimum  ");
		else System.out.println(c+" is minimum  ");
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
