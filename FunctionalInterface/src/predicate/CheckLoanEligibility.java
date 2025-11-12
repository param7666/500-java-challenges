package predicate;

import java.util.List;
import java.util.function.Predicate;

class Customer {
	 double loanAmt;
	 int age;
	 double income;
	 String name;
	 
	 Customer(double loanAmt, int age, double income,String name) {
		 this.loanAmt=loanAmt;
		 this.age=age;
		 this.income=income;
		 this.name=name;
	 }
	 
 }

public class CheckLoanEligibility {
public static void main(String[] args) {
	Customer c1=new Customer(550, 5, 100, "Param");
	Customer c2=new Customer(1000, 21, 500, "Parmeshwar");
	
	Predicate<Customer> eligible=(c)->c.age>=18 && c.income>=c.loanAmt/2;
	List<Customer> customers=List.of(c1,c2);
	for(Customer cust:customers) {
		System.out.println(eligible.test(cust));
	}
}
}
