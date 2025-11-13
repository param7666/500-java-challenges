package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctDemos {
public static void main(String[] args) {
	Stream<Integer> str=Stream.of(1,2,3,3,3,4,5,6,5,5,6);
	str.distinct().forEach(System.out::println); // removes duplicates
	System.out.println();
//===========================================================================================================

	//Employee Salary Records
	
	List<Integer> salary= Arrays.asList(3500,5800,54300,54300,3500,5800);
	List<Integer> unique=salary.stream().distinct().collect(Collectors.toList());
	System.out.println(unique);
	System.out.println();
//===========================================================================================================

	List<String> products=Arrays.asList("Laptop","Mobile","Laptop","Pen","Pen","Charger","Headphones","Headphones");
	products.stream().distinct().forEach(System.out::println);
//===========================================================================================================

	
}
}
