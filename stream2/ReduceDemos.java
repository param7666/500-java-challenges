package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceDemos {

	public static void main(String[] args) {
		
		// sum of all numbers
		Stream<Integer> stream=Stream.of(1,3,4,5,7,8,8);
		Integer sum=stream.reduce(0, (a,b)->a+b);
		System.out.println(sum);
		System.out.println();
//===========================================================================================================
		
		//multiply of number
		Stream<Integer> stream2=Stream.of(1,2,4,5,6,7,8,9);
		Integer multiply=stream2.reduce(1, (a,b)->a*b);
		System.out.println(multiply);
		System.out.println();
//===========================================================================================================
		
		// calculate total salary of employee
		 List<User> users = Arrays.asList(
		            new User("Ram", 40000),
		            new User("Shyam", 50000),
		            new User("Rita", 35000)
		        );
		 
		 double totalSalary=users.stream().map(u->u.salary).reduce(0.0, (a,b)->a+b);
		 System.out.println("Total Salary:: "+totalSalary);
//===========================================================================================================
		 
		 // find max salary
		 double max=users.stream().map(e->e.salary).reduce(Double::max).get();
		 System.out.println("Max Salary:: "+max);
		 System.out.println();
//===========================================================================================================
		// find max salary
		double min=users.stream().map(e->e.salary).reduce(Double::min).get();
		System.out.println("Min Salary:: "+min);
		System.out.println();
	}
}

class User{
	String name;
	double salary;
	
	public User(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	
}
