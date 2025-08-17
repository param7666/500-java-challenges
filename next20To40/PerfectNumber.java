package next20To40;


/*
 A perfect number means sum of its proper divisor except number itself
 so number is 6
 proper divisor = 1,2,3
 sum of divisor= 1+2+3=6
 num == sum (perfect number)
 */

public class PerfectNumber {
	
	public static void checkPerfectNumber(int num) {
		
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) System.out.println("Number is perfect");
		else System.out.println("Number is not perfect...");
	}
	
	public static void main(String[] args) {
		checkPerfectNumber(6);
	}

}
