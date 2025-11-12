package functional;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo03 {

	public static void main(String[] args) {
		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
		Predicate<String> p=name->name.charAt(0)=='A';
		for(String s:names) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
}
