package first01To20;

public class PositiveNegetiveZero {

	static void checkNumber(int num) {
		if(num>0) System.out.println("Number is positive");
		else if(num<0) System.out.println("Number is negetive");
		else System.out.println("number is zero");
	}
	public static void main(String[] args) {
		checkNumber(-1);
	}
}
