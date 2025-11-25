package iterators;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;

public class IteratorExamples {
public static void main(String[] args) {
	
	//Iterator
	
	List<String> names=Arrays.asList("Ram","Sham","Param","Ambika","Sundar","Sakhshi");
	
	Iterator<String> itr=names.iterator();
	while(itr.hasNext()) {
		String name=itr.next();
		System.out.println(name.toUpperCase());
		if(name.equalsIgnoreCase("Param")) {
			
		}
		//itr.remove();
	}
	System.out.println("=====================================================================");
//===========================================================================================================	
	
	//ListIterator
	
	List<String> cities=Arrays.asList("Pune","HYD","Mumbai","Delhi","Nanded");
	ListIterator<String> ltr=cities.listIterator();
	System.out.println("List Iterator::  Forword Direction");
	while(ltr.hasNext()) {
		System.out.println(ltr.next());
	}
	System.out.println();
	System.out.println("List Iterator::  Backword Direction");
	
	while(ltr.hasPrevious()) {
		System.out.println(ltr.previous());
	}
	
	System.out.println("=====================================================================");
	//===========================================================================================================	

	System.out.println("List Iterator::  Backword Direction");
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
	ListIterator<Integer> ltr2=numbers.listIterator(numbers.size()); // start from last index
	
	while(ltr2.hasPrevious()) {
		System.out.println(ltr2.previous());
	}
	
	System.out.println("=====================================================================");
	//===========================================================================================================	

	
	// Enumaration
	
	Vector<Character> vector=new Vector<>();
	vector.add('A'); vector.add('B'); vector.add('C'); vector.add('D'); vector.add('E'); vector.add('F');
	Enumeration<Character> en=vector.elements();
	System.out.println("Enumaration::  Forword Direction with Vector");
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	
	System.out.println("=====================================================================");
	//===========================================================================================================	

	Stack<String> gfs=new Stack<>();
	gfs.add("Sakshi");  gfs.add("Mounica");  gfs.add("Sundar");  gfs.add("Ambika");  gfs.add("Sonu");
	
	Enumeration<String> en2=gfs.elements();
	System.out.println("Enumaration::  Forword Direction with Stack");
	while(en2.hasMoreElements()) {
		System.out.println(en2.nextElement());
	}
	
	System.out.println("=====================================================================");
	//===========================================================================================================	

	List<String> techs = Arrays.asList("Java", "Python", "C++", "Spring");
	Spliterator<String> splt1=techs.spliterator();
	
	System.out.println(splt1); // hashcode
	System.out.println("Spliterator:: ussing forEachRemaining:: ");
	Spliterator<String> splt2=splt1.trySplit();
	System.out.println();
	splt1.forEachRemaining(System.out::println);
	splt2.forEachRemaining(System.out::println);
	
	System.out.println("=====================================================================");
	//===========================================================================================================	

}
}
