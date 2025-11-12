package stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo01 {
public static void main(String[] args) {
	Stream.of(1,2,3,4,5,6,7);
	List<Integer> list=List.of(5,4,3,2,1);
	list.stream().filter(i ->i>3).forEach(System.out::println);
	
}
}
