package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
1) Employee Salary Hike Processing

You have a list of employees with name, department, and salary.
You must filter only employees from “IT”, increase their salary by 10%, sort them by updated salary, and collect the final list of names.

 */
public class EmpSalaryHikeProccessing {
public static void main(String[] args) {
	Employee e1  = new Employee(101, "Amit Sharma", "IT", 65000);
	Employee e2  = new Employee(102, "Neha Patil", "HR", 55000);
	Employee e3  = new Employee(103, "Rohan Desai", "Finance", 72000);
	Employee e4  = new Employee(104, "Priya Kulkarni", "IT", 80000);
	Employee e5  = new Employee(105, "Suresh Jadhav", "Marketing", 50000);
	Employee e6  = new Employee(106, "Manisha Gupta", "Sales", 48000);
	Employee e7  = new Employee(107, "Karan Verma", "Operations", 60000);
	Employee e8  = new Employee(108, "Sneha Joshi", "IT", 90000);
	Employee e9  = new Employee(109, "Vikas Pawar", "Finance", 65000);
	Employee e10 = new Employee(110, "Anita More", "HR", 53000);

	List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
	
	// APPROCH ONE
	
	List<String> names=list.stream()
			.filter(e->e.getDepartment().equals("IT")) // collect IT Emp
			.map(e-> new Employee( 
					e.getId(),
					e.getName(),
					e.getDepartment(),
					e.getSalary()*1.10))   // Update salary
			.sorted(Comparator.comparingDouble(Employee::getSalary)) // sort them based on salary
			.map(Employee::getName) // collect names
			.collect(Collectors.toList()); // collect as List
	System.out.println(names); // print
	
	
}
}

class Employee{
	private int id;
	private String name;
	private String department;
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name,String department,double salary) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}