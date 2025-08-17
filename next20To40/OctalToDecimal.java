package next20To40;

public class OctalToDecimal {
	
	public static void convertOctToDec(String octal) {
		int decimal=0;
		if(octal.contains("8") || octal.contains("9")) System.out.println("Envalid Octal");
		else {
		for(int i=0;i<octal.length();i++) {
			decimal=decimal*8+(octal.charAt(i)-'0');
		}
		System.out.println(decimal);
	}
		
	}
public static void main(String[] args) {
	convertOctToDec("1239");
}
}
