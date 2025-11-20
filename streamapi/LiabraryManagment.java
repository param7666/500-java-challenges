package streamapi;

/*
9) Library Management – Overdue Books

A list of books contains title, dueDays, and studentName.
Find books with dueDays > 30, sort by dueDays, map to student names, and remove duplicates.

 */

import java.util.*;
public class LiabraryManagment {

	public static void main(String[] args) {
		 List<Book> books = Arrays.asList(
	                new Book("Java Basics", 25, "Amit"),
	                new Book("Spring Boot Guide", 40, "Sneha"),
	                new Book("Data Structures", 35, "Amit"),
	                new Book("Operating Systems", 45, "Rahul"),
	                new Book("DBMS Concepts", 50, "Sneha"),
	                new Book("Computer Networks", 15, "Meena"),
	                new Book("Python Crash Course", 60, "Priya"),
	                new Book("C++ Programming", 32, "Karan"),
	                new Book("Machine Learning Intro", 10, "Vikram"),
	                new Book("React Handbook", 42, "Rohit"),
	                new Book("Algorithms Book", 34, "Rahul"),
	                new Book("Cloud Computing", 55, "Amit")
	        );
		 
		 books.stream().filter(b->b.getDueDays()>30)
		 .sorted(Comparator.comparingInt(Book::getDueDays))
		 .map(b->b.getStudentName())
		 .distinct()
		 .forEach(System.out::println);
	}
}


class Book {
    private String title;
    private int dueDays;
    private String studentName;

    public Book(String title, int dueDays, String studentName) {
        this.title = title;
        this.dueDays = dueDays;
        this.studentName = studentName;
    }

    public String getTitle() {
        return title;
    }

    public int getDueDays() {
        return dueDays;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return title + " | DueDays: " + dueDays + " | Student: " + studentName;
    }
}
