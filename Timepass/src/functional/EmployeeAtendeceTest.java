package functional;

import java.util.List;
import java.util.function.Predicate;

class Employee{
		String name;
		int attendece;
		public Employee(String name, int attendece) {
			this.name=name;
			this.attendece=attendece;
		}
	}


public class EmployeeAtendeceTest {
public static void main(String[] args) {
	Predicate<Employee> pr=(e)->e.attendece>60;
	List<Employee> list=List.of(new Employee("Param", 70), new Employee("Sundar", 40));
	for(Employee e:list) {
		if(pr.test(e)) {
			System.out.println(e.name);
		}
	}
	
}
}
