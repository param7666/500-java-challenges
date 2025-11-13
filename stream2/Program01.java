package stream2;

import java.util.List;

public class Program01 {
public static void main(String[] args) {
	List<Integer> list=List.of(1,2,3,4,5); // source
	list.stream() // source converted into stram
	.filter((a)->a%2==0) // intermediate operation
	.forEach(System.out::println); // terminal operation
}
}
