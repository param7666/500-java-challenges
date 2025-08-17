package first01To20;

import java.util.Scanner;

public class ArmstrongNumber {
	static Scanner sc=new Scanner(System.in);
	
	public static void checkArmstrongNumber(int num) {
		int orgNum=num;
		int temp=num; // store into temp for operation
		int length=0;
		while(temp>0) {
			length++;
			temp=temp/10;
		}
		
		int sum=0;
		while(num>0) {
			int digit=num%10;
			int power=1;
			for(int i=1;i<=length;i++) {
				power=power*digit;
			}
			sum+=power;
			num=num/10;
		}
		if(orgNum==sum) {
			System.out.println("Number is armstrong................");
		} else System.out.println("NUmber is not armstrong...........");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Number....");
		int num=sc.nextInt();
		ArmstrongNumber.checkArmstrongNumber(num);
	}

}
