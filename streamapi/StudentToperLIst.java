package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
3) Student Marks – Toppers List

A list of students contains name, marks, and city.
Create a list of top 3 scorers from Pune city, after filtering marks > 75, sorting by marks, and mapping to just student names.

 */


public class StudentToperLIst {

	public static void main(String[] args) {
		Student s1  = new Student("Amit", 85, "Pune");
		Student s2  = new Student("Sneha", 92, "Pune");
		Student s3  = new Student("Rohan", 35, "Pune");
		Student s4  = new Student("Priya", 88, "Pune");
		Student s5  = new Student("Karan", 43, "Pune");
		Student s6  = new Student("Neha", 81, "Pune");
		Student s7  = new Student("Vikas", 67, "Pune");
		Student s8  = new Student("Manisha", 90, "Pune");
		Student s9  = new Student("Suresh", 98, "Pune");
		Student s10 = new Student("Anita", 99, "Pune");

		List<Student> students = Arrays.asList(
			    s1, s2, s3, s4, s5, s6, s7, s8, s9, s10
			);

		List<String> topThreeStudentNames=students.stream()
				.filter(s->s.getCity().equals("Pune") && s.getMarks()>75) // collect from pune and more than 75 marks
				.sorted(Comparator.comparingInt(Student::getMarks).reversed()) // sort in reverserd based on marks
				.map(s->s.getName()) // collect names
				.limit(3) // collect only 3 
				.collect(Collectors.toList()); // collect to List
		System.out.println(topThreeStudentNames); // print
				
	}
}



class Student{
	private String name;
	private int marks;
	private String city;
	
	public Student(String name, int marks, String city) {
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}