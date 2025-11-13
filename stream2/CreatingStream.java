package stream2;

import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
public static void main(String[] args) {
	Stream.of(1,2,4,6,7,9);
	List<Character> list=List.of('A','C','E','T','N');
	list.stream();
	
	Stream<Integer> numbers=Stream.iterate(1, n->n+1).limit(10);
	numbers.forEach(System.out::println);
}
}
