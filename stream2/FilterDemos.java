package stream2;

import java.util.Arrays;
import java.util.List;

public class FilterDemos {
public static void main(String[] args) {
	// filter active users
	List<String> customers = Arrays.asList("John-active", "Amy-inactive", "Raj-active");
	customers.stream().filter(a->a.endsWith("active")).forEach(System.out::println);
	
	//From a list of transaction amounts, print only those greater than ₹10,000.
	List<Integer> transactions = Arrays.asList(5000, 12000, 45000, 8000, 20000);
	transactions.stream().filter(n->n>=10000).forEach(System.out::println);
	
	//filter product on stock
	List<String> products = Arrays.asList("Laptop-available", "TV-outofstock", "Mobile-available");
	products.stream().filter(p->p.contains("available")).forEach(System.out::println);
	
	//From a list of students with their marks, print names of those who scored more than 60.
	List<Integer> marks = Arrays.asList(55, 72, 90, 48, 65);
	marks.stream().filter(m->m>60).forEach(System.out::println);
	
	//From a list of emails, print only company emails (ending with @company.com)
	List<String> emails = Arrays.asList("raj@gmail.com", "neha@company.com", "amit@company.com", "sam@yahoo.com");
	emails.stream().filter(m->m.endsWith("@company.com")).forEach(p->System.out.println(p));
}
}
