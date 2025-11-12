package stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");
	names.stream().filter(name->name.charAt(0)=='A').forEach(System.out::println);

}
}
