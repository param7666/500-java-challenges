package Problem01to20;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Find Sum of Array Elements Problem: Write a program to find the sum of all
elements in an array. Logic: Iterate through array and add each element to sum. Test
Case: Input: arr = [1, 2, 3, 4, 5] Output: Sum = 15
 */

public class SumOfElement {

	public static void sumUsingStream(int arr[]) {
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
	}
	
	public static void sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	
	public static void sumUsingReduce(int arr[]) {
		int sum=Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println(sum);
	}
	
	public static void sumUsingFunctionalProg(int arr[]) {
		int sum=Arrays.stream(arr).reduce(0, (Integer::sum));
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		sum(arr);
		sumUsingFunctionalProg(arr);
		sumUsingReduce(arr);
		sumUsingStream(arr);
	}
}
