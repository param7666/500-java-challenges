package optional;

import java.util.Optional;

class Customer{
	public String panNumber;
	
	public Customer(String panNumber) {
		this.panNumber=panNumber;
	}
	
	public Optional<String> getPanNumber(){
		return Optional.ofNullable(panNumber);
	}
}


public class PanNumberValidation {
public static void main(String[] args) {
	
	 // Case 1: Customer with PAN number
    Customer c1 = new Customer("ABCDE1234F");

    // Case 2: Customer without PAN number
    Customer c2 = new Customer(null);
    
    c1.getPanNumber().ifPresent(pan->System.out.println(pan)); // orignal pan
     
    c2.getPanNumber().ifPresent(pan->System.out.println(pan)); // empty
    
    System.out.println("Pan Proccesing Done...");
}
}
