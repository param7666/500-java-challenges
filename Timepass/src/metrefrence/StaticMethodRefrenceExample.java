package metrefrence;

import java.util.function.Function;

public class StaticMethodRefrenceExample {

	public static int square(int n) {
		return n*n;
	}
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> fun=StaticMethodRefrenceExample::square;
		System.out.println(fun.apply(5));
	}
}
