package next20To40;
/*
Find Cube Root Problem: Write a program to find the cube root of a number. 
Logic: Use binary search or built-in function. 
Test Case: Input: number = 27 Output: Cube root = 3.0
*/

public class CubeRoot {
	
	public static void checkCubeRoot(int num) {
		int result=0;
		for(int i=1;i<=num/2;i++) {
			if(num==(i*i*i)) {
				result=i;
			} else if((i*i*i)<=num) {
				result=i;
			} else {
				break;
			}
		}
		System.out.println("Cube of "+num+" is "+result);
	}
	
public static void main(String[] args) {
	checkCubeRoot(27);
}
}
