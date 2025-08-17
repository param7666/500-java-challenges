package next20To40;

public class DecimalToHexadecimal {
	public static void convertHexaDecimal(int decimal) {
		String hex="";
		String hexDigit="0123456789ABCDEF";
		while(decimal>0) {
			int rem=decimal%16;
			hex=hexDigit.charAt(rem) +hex;
			decimal/=16;
		}
	}

}
