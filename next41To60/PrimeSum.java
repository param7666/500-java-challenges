package next41To60;
/*
47.	Find Sum of Prime Numbers Problem: Write a program to find sum of prime numbers up to n. 
Logic: Check each number for primality and add to sum. 
Test Case: Input: n = 10 Output: Sum = 17 (2 + 3 + 5 + 7) 
 */
public class PrimeSum {
	
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) return true;
		else return false;
	}
	
	public static void primeSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println("Sum of prime "+sum);
	}
	
public static void main(String[] args) {
	primeSum(10);
}
}
