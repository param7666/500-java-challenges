package next20To40;

/*
Binary to Decimal Conversion
 */

public class BinaryToDecimal {
	public static void convertBinToDec(int orgNum) {
		System.out.println(orgNum);  
		String binary=String.valueOf(orgNum);
		System.out.println(binary);
		int num=0;
		for(int i=0;i<binary.length();i++) {
			num=num*2+(binary.charAt(i)-'0'); // binary.charAt(i)-'0' = '1'-'0'= ascii values 49-48=1
											 // or  binary.charAt(i)-'0' = '0'-'0'= ascii values 48-48=0
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		convertBinToDec(1101);
		convertBinToDec(01101); // treated as octel becuase 0 first so actaul values is 577
	}
}
