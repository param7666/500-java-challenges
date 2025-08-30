package next41To60;

/*
55.	Find Hexagonal Number Problem: Write a program to check if a number is hexagonal. 
Formula: H(n) = n(2n-1) 
Test Case: Input: number = 15 Output: 15 is a 
hexagonal number 

 */
public class Hexagonal {
	
	public static boolean isHexagonal(int num) {
		if(num<=0) return false;
		int i=1;
		int hNum=0;
		while(hNum<num) {
			hNum=i*(2*i-1);
			if(hNum==num) return true;
			i++;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isHexagonal(15)?"is a Hexagonal number":"Not a Hexagonal Number ");
	}

}
