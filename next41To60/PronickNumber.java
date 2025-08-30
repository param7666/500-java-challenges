package next41To60;

/*
52.	Check Pronic Number Problem: Write a program to check if a number is pronic. 
Logic: Product of two consecutive integers. 
Test Case: Input: number = 12 Output: 12 is a pronic number 
 */

public class PronickNumber {

	public static void isPronick(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i+1;j<num;i++) {
				if(i*j==num) {
					System.out.println(num+" is pronic and consecative numbers are : : "+i+" "+j);
				}
				break;
			}
		}
	}
	public static void main(String[] args) {
		isPronick(6);
	}
}
