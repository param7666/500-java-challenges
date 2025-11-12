package day01;

@FunctionalInterface
interface MyInterface<T>{
	boolean test(T t);
}

public class PredicateTesting {
public static void main(String[] args) {
	MyInterface<Integer> check=(a)->a%2==0;
	System.out.println(check.test(15));
}
}
