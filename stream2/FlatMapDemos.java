package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemos {

	public static void main(String[] args) {
		List<List<String>> departments = Arrays.asList(
			    Arrays.asList("John", "Amy"),
			    Arrays.asList("Raj", "Sneha"),
			    Arrays.asList("Kiran", "Maya")
			);
		departments.stream().flatMap(List::stream).forEach(System.out::println);
		System.out.println();
//===========================================================================================================

		 List<Employeee> employees = Arrays.asList(
		            new Employeee("John", Arrays.asList("Java", "Spring")),
		            new Employeee("Amy", Arrays.asList("Python", "ML")),
		            new Employeee("Raj", Arrays.asList("Java", "Angular"))
		        );
		 
		 List<String> skills=employees.stream().flatMap(s->s.getSkills().stream()).distinct().collect(Collectors.toList());
		 System.out.println(skills); System.out.println();
//===========================================================================================================

		//Split Sentences into Words
		 List<String> sentences = Arrays.asList(
		            "I love Java",
		            "Streams are powerful",
		            "flatMap is cool"
		        );
		 
		 sentences.stream().flatMap(sentence->Arrays.stream(sentence.split(""))).forEach(System.out::println);
		 System.out.println();
//===========================================================================================================
		 
		 List<Customer> customers = Arrays.asList(
		            new Customer("John", Arrays.asList(
		                    new Order(Arrays.asList("Laptop", "Mouse")),
		                    new Order(Arrays.asList("Keyboard"))
		            )),
		            new Customer("Amy", Arrays.asList(
		                    new Order(Arrays.asList("Phone", "Charger"))
		            ))
		        );
		 
		 List<String> allProducts=customers.stream().flatMap(c->c.orders.stream()).flatMap(o->o.getProducts().stream()).collect(Collectors.toList());
		 System.out.println(allProducts);
		 System.out.println();
		 
//===========================================================================================================
		 
	}

}



class Employeee {
    String name;
    List<String> skills;

    Employeee(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }
}


class Order {
    List<String> products;
    Order(List<String> products) {
        this.products = products;
    }
    List<String> getProducts() { return products; }
}

class Customer {
    String name;
    List<Order> orders;
    Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }
    List<Order> getOrders() { return orders; }
}