package functional;

import java.util.function.Predicate;

public class VerifyEmailTest {
public static void main(String[] args) {
	String mail="param@gmail.com";
	Predicate<String> p=(m)->m.contains("@");
	System.out.println(p.test(mail));
}
}
