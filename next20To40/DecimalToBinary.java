package next20To40;

// decimal to binary convertion

public class DecimalToBinary {

	public static void DecToBin(int decimal) {
		if(decimal==0) System.out.println("Binary Value is 0 ");
		else {
			String binary=""; // to store binary value
			while(decimal>0) { // check until nothing to left
				binary=(decimal%2)+binary; // decimal % 2 → Gets the remainder when dividing by 2 (always 0 or 1)
				    						  //+ binary → PREPENDS the remainder to existing binary string
				
				decimal/=2; // Reduce the problem
			}
			System.out.println("Binary value is "+ binary);
		}
	}
	
	public static void main(String[] args) {
		DecToBin(11);
	}
}
