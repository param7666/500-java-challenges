package next20To40;

/*
25.	Find Average of Numbers Problem: Write a program to find the average of given numbers. 
Formula: Average = Sum / Count 
Test Case: Input: numbers = [10, 20, 30, 40, 50] Output: Average = 30.0 
 */

public class AverageNUmber {
	
	public static void checkAverage(int arr[]) {
		int length=arr.length;
		int sum=0;
		for(int i=0;i<length;i++) {
			sum+=arr[i];
		}
		System.out.println("Average is "+sum/arr.length);
	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		checkAverage(arr);
		
		
	}

}
