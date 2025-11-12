package stream;

import java.util.Arrays;
import java.util.List;

public class MapDemo02 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");

	names.stream().filter(name->name.charAt(0)=='A').mapToInt(name->name.length()).forEach(i->System.out.println(i));
}
}
