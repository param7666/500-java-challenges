package metrefrence;

import java.util.Arrays;
import java.util.List;

interface OrderCompartor{
	void compare(Order o1, Order o2);
}


public class Order {
	
	String name;
	Double price;
	
	Order(String name, Double price) {
		this.name=name;
		this.price=price;
	}
	
	 public int compareByAmount(Order other) {
	        return Double.compare(this.price, other.price);
	    }
	
public static void main(String args[]){
	 List<Order> orders = Arrays.asList(
	            new Order("Param", 8500.50),
	            new Order("Baby", 12999.99),
	            new Order("Riya", 5000.00),
	            new Order("Aryan", 12000.00)
	        );
	 
}
}
