package functional;

import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}


public class Demo04 {
public static void main(String[] args) {
	Person p1=new Person("A", 15);
	Person p2=new Person("B", 6);
	Person p3=new Person("C", 1);
	Person p4=new Person("D", 26);
	Person p5=new Person("E", 65);
	Person p6=new Person("F", 30);
	List<Person> per=List.of(p1,p2,p3,p4,p5,p6);
	
	Predicate<Person> p=a->a.age>18;
	
	for(Person pr:per) {
		if(p.test(pr)) {
			System.out.println(pr.name);
		}
	}
}
}
