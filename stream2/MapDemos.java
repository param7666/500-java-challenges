package stream2;

import java.util.Arrays;
import java.util.List;

public class MapDemos {

	public static void main(String[] args) {
		List<String> products = Arrays.asList("laptop", "mobile", "tv");
		products.stream().map(String::toUpperCase).forEach(System.out::println);
//===========================================================================================================
		
		//Convert product prices from USD to INR
		List<Integer> prices=Arrays.asList(50,20,49,58,49,51,88);
		prices.stream().map(a->a*83).forEach(u->System.out.print("Rs"+u+" "));
		System.out.println();
		
//===========================================================================================================

		//Extract email IDs of employees
		List<Employee> employees=Arrays.asList(new Employee("John", "john@gmail.com", "HR", 50000),
		new Employee("Amy", "amy@company.com", "IT", 60000),
		new Employee("Raj", "raj@company.com", "Finance", 55000));
		
		employees.stream().map(e->e.email).forEach(System.out::println);
		System.out.println();
//===========================================================================================================

		//Convert customer names to uppercase
		List<String> names=Arrays.asList("Param","Sundar","Ambika","sakshi","Mounica","Sonu");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println();
//===========================================================================================================

		//Get length of each feedback comment
		List<String> comments=Arrays.asList("Nice","Bad Choice","Very Expensive","Affortable","Dont Buy","Must Buy");
		comments.stream().map(a->a.length()).forEach(System.out::println);
		System.out.println();
//===========================================================================================================

	}
	
	
}


class Employee{
	String name;
	String email;
	String department;
	int salary;
	
	public Employee(String name,String email,String department,int salary){
		this.name=name;
		this.email=email;
		this.department=department;
		this.salary=salary;
	}
}

