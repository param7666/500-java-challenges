package next41To60;

/*
50.	Check Kaprekar Number Problem: Write a program to check if a number is a Kaprekar number. 
Logic: Square can be split into parts that sum to original number. 
Test Case: Input: number = 45 Output: 45 is a Kaprekar number 
 */

public class Kaprekar {
	
	public static void isKaprekar(int num) {
		int square=num*num;
		System.out.println("square:: "+square);
		String str=String.valueOf(square);
		System.out.println("String:: "+str);
		String str1="";
		String str2="";
		
		for(int i=0;i<str.length();i++) {
			if(i>=str.length()/2) {
				str2=str2+=str.charAt(i);
			}else {
			str1=str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
		System.out.println(str2);
		int num1=Integer.valueOf(str1);
		int num2=Integer.valueOf(str2);
		
		System.out.println(num1+num2==num?"number is Kaprekar":"number is not Kaprekar");
	}

	public static void main(String[] args) {
		isKaprekar(95);

	}

}
