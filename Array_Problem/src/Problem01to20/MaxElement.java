package Problem01to20;

/*
101.	Find Maximum Element in Array Problem: Write a program to find the maximum element in an array. 
Logic: Iterate through array and keep track of maximum element. 
Test Case: Input: arr = [3, 7, 1, 9, 2] Output: Maximum = 9 
 */

public class MaxElement {

	public static void findMax(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int arr[]= {3, 7, 1, 9, 2};
		findMax(arr);
	}
}
