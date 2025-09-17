package Problem01to20;

/*
102. Find Minimum Element in Array Problem: Write a program to find the minimum
element in an array. Logic: Iterate through array and keep track of minimum element.
Test Case: Input: arr = [3, 7, 1, 9, 2] Output: Minimum = 1
 */

public class MinElement {

	public static void findMinElement(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		int arr[]= {3, 7, 1, 9, 2};
		findMinElement(arr);
	}
}
