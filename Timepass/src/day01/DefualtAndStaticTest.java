package day01;

import java.util.concurrent.Callable;
import java.util.function.Predicate;

interface A{
	default void show() {
		System.out.println("A.show()");
	}
}

interface B{
	default void show() {
		System.out.println("B.show()");
	}
}


public class DefualtAndStaticTest implements A,B{
	
	@Override
	public void show() {
		A.super.show();
	}
	
	
public static void main(String[] args) {
	new DefualtAndStaticTest().show();
	
}


}
