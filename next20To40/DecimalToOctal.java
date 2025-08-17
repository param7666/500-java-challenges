package next20To40;

public class DecimalToOctal {

	public static void decimalToOctal(int num) {
		if(num==0) System.out.println(" 0 ");
		else {
		String octal="";
		while(num>0) {
			octal=(num%8)+octal;
			num/=8;
		}
		
		System.out.println(octal);
		}
	}
	public static void main(String[] args) {
		decimalToOctal(1234);
	}
}
