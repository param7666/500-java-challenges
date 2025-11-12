package predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//Verify if a username or password meets security rules.

public class SecurityRules {

	public static void main(String[] args) {
		String username="parmesh";
		String password="iloveyou@123";
		
		BiPredicate<String, String> checkRules=(u,p)->u.length()>6 && u.length()<=15 && p.contains("@")&&p.length()>=8;
		System.out.println(checkRules.test(username, password));
	}
}
