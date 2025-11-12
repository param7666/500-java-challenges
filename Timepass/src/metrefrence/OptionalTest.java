package metrefrence;

import java.util.Optional;

public class OptionalTest {

	public Optional<String> m1(int id) {
		String s=null;
		if(id>=100 && id<=200) {
			s="Param";
		}
		return Optional.ofNullable(s);
	}
	public static void main(String[] args) {
		System.out.println(new OptionalTest().m1(115));
	}
}
