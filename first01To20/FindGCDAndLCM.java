package first01To20;

public class FindGCDAndLCM {
	public static int FindGCD(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static void findLCM(int a,int b) {
		int result=(a*b)/FindGCD(a, b);
		System.out.println("LCM is "+result);
	}
	public static void main(String[] args) {
		findLCM(10,20);
	}

}
