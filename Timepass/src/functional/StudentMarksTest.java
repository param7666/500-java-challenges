package functional;

import java.util.List;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	Student(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
}
public class StudentMarksTest {
public static void main(String[] args) {
	List<Student> list=List.of(new Student("Param",40),new Student("Kishor",50),new Student("Ambika",15));
	Predicate<Student> pr=(student)->student.marks>30;
	for(Student s:list) {
		if(pr.test(s)) {
			System.out.println(s.name);
		}
	}
}
}
