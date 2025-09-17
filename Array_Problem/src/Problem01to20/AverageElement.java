package Problem01to20;

import java.util.Arrays;
import java.util.OptionalDouble;

/*
Find Average of Array Elements Problem: Write a program to find the average of
array elements. Formula: Average = Sum / Length 
Test Case: Input: arr = [10, 20, 30, 40,50] Output: Average = 30.0
 */

public class AverageElement {

	public static void avarageUsingStream(int arr[]) {
		OptionalDouble avg=Arrays.stream(arr).average();
		System.out.println(avg);
	}
	
	public static void avarageUsingreduce(int arr[]) {
		double avg=Arrays.stream(arr).reduce(0,(Integer::sum))/(double)arr.length;
		System.out.println(avg);
	}
	
	public static void avarageUsingLoop(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum/arr.length);
	}
	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40,50};
		avarageUsingLoop(arr);
		avarageUsingStream(arr);
		avarageUsingreduce(arr);
		/*
		 OUTPUT
		 30
		 OptionalDouble[30.0]
		 30.0
		 */
	}
}
