package next41To60;

/*
48.	Check Emirp Number Problem: Write a program to check if a number is emirp. 
Logic: Prime number that gives different prime when reversed. 
Test Case: Input: number = 13 Output: 13 is an emirp number 

 */

public class EmirpNumber {

	//Method to check number is prime or not
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
	
	// method to check reverse number
	public static int reverseNumber(int num) {
		int reverse=0;
		while(num>0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		System.out.println("Reverse number "+reverse);
		return reverse;
	}
	
	// method to check number is Emirp
	public static void isEmirp(int num) {
		if(isPrime(num)) { // if org number is prime
			int reverse=reverseNumber(num); // reverse the number
			if(isPrime(reverse)) { // if revrse number also prime
				System.out.println("Number is Emirp"); // yes number is IsEmirp
			}
		}
		else System.out.println("Number is not Emirp..");
	}
	
	public static void main(String[] args) {
		isEmirp(13);
	}

}
