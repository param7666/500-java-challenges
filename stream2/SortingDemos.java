package stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingDemos {
public static void main(String[] args) {
	//natural sorting of integer
	List<Integer> numbers=Arrays.asList(1,4,2,6,3,7,9,16,18,3,4);
	System.out.println("Natural Order........");
	numbers.stream().sorted().limit(5).forEach(System.out::println);
	System.out.println("Reverse Order........");
	numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	System.out.println();
//===========================================================================================================
	
	// natural sorting of charectors
	
	List<Character> chars=Arrays.asList('A','D','Z','N','E','Z','B');
	System.out.println("Natural Order........");
	chars.stream().distinct().sorted().skip(2).forEach(System.out::println);
	System.out.println("Reverse Order........");
	chars.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
	System.out.println();
//===========================================================================================================
	
	// natural sorting of string
	
	List<String> strs=Arrays.asList("Param","Sundar","Ambika","Sakshi","Sonu","Mounica");
	System.out.println("Natural Order........");
	strs.stream().sorted().forEach(System.out::println);
	System.out.println("Reverse Order........");
	strs.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
//===========================================================================================================

	// object sorting in natural order bassed on salary
	List<Employee2> list = Arrays.asList(
		    new Employee2("Ravi", 50000.0),
		    new Employee2("Sneha", 70000.0),
		    new Employee2("Ajay", 40000.0)
		);
	System.out.println("Natural Order........");
	list.stream().sorted(Comparator.comparing(a->a.salary)).forEach(System.out::println);
	System.out.println("Reverse Order........");
	list.stream()
	.sorted(Comparator.comparing(Employee2::getSalary).reversed())
	.forEach(System.out::println);
	
//===========================================================================================================

	// peak() // for normal printing without disturbing the pipeline/flow
	
	List<Integer> numbres=Arrays.asList(5,3,6,3,7,2,8,0,21,7,8,4,33,3,32,2,1,11);
	numbers.stream().filter((n)->n%2==0)
	.peek((n)->System.out.println("Even Number "+n))
	.map(e->e*2)
	.distinct()
	.forEach(System.out::println);
	System.out.println();
//===========================================================================================================

	// Joining by
	List<Employee2> emplist = Arrays.asList(
		    new Employee2("Ravi", 50000.0),
		    new Employee2("Sneha", 70000.0),
		    new Employee2("Ajay", 40000.0),
		    new Employee2("Param",580.22)
		);
	Map<String, Double> empMap=emplist.stream().collect(Collectors.toMap(e->e.name,e->e.salary));
	System.out.println(empMap);
	
	String name=emplist.stream().map(e->e.name).collect((Collectors.joining(",")));
	System.out.println(name);
//===========================================================================================================

	//Counting
	long count= Stream.of("Active","Active","Inactive","Active").filter(s->s.contains("Active")).collect(Collectors.counting());
	 System.out.println("Count:: "+count);
	
//===========================================================================================================

	 //Group by
	 
	 List<Employee2> emplist2 = Arrays.asList(
			    new Employee2("Ravi", 50000.0,"IT"),
			    new Employee2("Sneha", 70000.0,"CS"),
			    new Employee2("Ajay", 40000.0,"IT"),
			    new Employee2("Param",580.22,"CS")
			);
	 
	 Map<String, List<Employee2>> groupByDep=emplist2.stream().collect(Collectors.groupingBy(e->e.department));
	 System.out.println(groupByDep);
	 System.out.println();
//===========================================================================================================

	 
}
}


class Employee2 {
    public String name;
    public Double salary;
    public String department;

    Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    Employee2(String name, double salary,String department) {
        this.name = name;
        this.salary = salary;
        this.department=department;
    }

    public String toString() {
        return name + " - " + salary;
    }
    
    public Double getSalary() {
    	return salary;
    }
}

