package metrefrence;


@FunctionalInterface
interface Test{   // interface
	public void m1(); // abstarct method
}

public class StMeReExa { // class
public static void m2() { // concrete static method
	System.out.println("Hello...."); 
}
public static void main(String[] args) {
	Test t=StMeReExa::m2; // stored into Test Ref
	t.m1();
}
}
