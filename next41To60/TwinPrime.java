package next41To60;

/*
: Write a program to check if two numbers are twin primes. 
Logic: Both are prime and differ by 2. 
Test Case: Input: a = 11, b = 13 Output: 11 and 13 are twin primes 
 */

public class TwinPrime {
	
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
	
	public static void isTwinPrime(int num1,int num2) {
		if((num1+2)==num2) {
			System.out.println(num1+ " "+num2);
			boolean num1IsPrime=isPrime(num1);
			boolean num2IsPrime=isPrime(num2);
			if(num1IsPrime==num2IsPrime) System.out.println("Number is twin prime");
			else System.out.println("Number is not twin prime");
			
		} else if((num2-2)==num1) {
			System.out.println(num1+ " "+num2);
			boolean num1IsPrime=isPrime(num1);
			boolean num2IsPrime=isPrime(num2);
			if(num1IsPrime==num2IsPrime) System.out.println("Number is twin prime");
			else System.out.println("Number is not twin prime");
			
		} else {
			System.out.println(num1+ " "+num2);
			System.out.println("Number is not twin...");
		}
	}
	
	public static void main(String[] args) {
		isTwinPrime(11, 13);
	}

}
