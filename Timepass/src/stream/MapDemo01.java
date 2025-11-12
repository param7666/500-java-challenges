package stream;

import java.util.Arrays;
import java.util.List;


public class MapDemo01 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("india","usa","uk", "japan");
	names.stream().map(name->name.toUpperCase()).forEach(name->System.out.println(name));
	names.stream().mapToInt(name->name.length()).forEach(i->System.out.println(i));

}
}
