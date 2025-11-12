package functional;

import java.util.List;
import java.util.function.Function;

class Emp{
	String name;
	String performance;
	Double salary;
	
	Emp(String name, String performance, Double salary){
		this.name=name;
		this.performance=performance;
		this.salary=salary;
	}
}


public class PerformanceStatus {
public static void main(String[] args) {
	List<Emp> list=List.of(new Emp("Sundar", "Good", 2500.0),new Emp("Ambika","Good",2000.0),new Emp("Sakshi", "Bad", 20000.0));
	Function<Emp, Emp> fun=(emp)-> {
		if(emp.performance.equalsIgnoreCase("good")) {
			emp.salary+=500;
			
		}
		return emp;
	};
	
	for(Emp e:list) {
		System.out.println(fun.apply(e).salary);
	}
}
}
