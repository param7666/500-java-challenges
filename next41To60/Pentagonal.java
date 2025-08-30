package next41To60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
random tasks....
 */

public class Pentagonal {
	
	public static void isPrime(int num) {
		int count=0;
		for(int i=1;i<num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) System.out.println("prime");
		else System.out.println("Not prime");
	}
	
	
	
	public static void isPalindrome(int num) {
		int temp=num; //121
		int rev=0;
		
		while(temp>0) {
			int digit=temp%10;// 1 2 1
			rev=10*rev+digit; // 10+2 =121
			temp=temp/10; // 1
			
		}
		
		System.out.println(rev);
		System.out.println(num==rev?"palindrome":"Not");
	}
	
	
	public static void reverse(String str) {
		System.out.println("Orginal String:: "+str);
		String rev=""; //marap
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse String:: "+rev);
	}
	
	
	public static void printUnique(int arr[]) {
		System.out.println("Origanal Array:: "+Arrays.toString(arr));
		Set<Integer> set=new HashSet<Integer>();
		List<Integer> list= new ArrayList<Integer>();
		for(int i=arr[0];i<arr.length;i++) {
			set.add(arr[i]);
			if(set.contains(arr[i])) {
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
				}
			}
		}
	
		System.out.println("Unique Element::  "+Arrays.toString(set.toArray()));
		System.out.println("Duplicate unique Element::  "+list);
		
	}
	
		public static void fib(int num) {
		int num1=0;
		int num2=1;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		int sum=num1+num2;
		for(int i=3;i<=num;i++) {
			int num3=num1+num2;
			sum+=num3;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			
		}
		System.out.println("\nSum"+sum);
	}
	
	public static void main(String[] args) {
		//isPrime(13);
		//isPalindrome(131);
		//reverse("param");
//		int arr[]= {1,2,3,3,4,5,7,4,3,2,1};
//		printUnique(arr);
		
		fib(10);
	}
	
	
	

}
