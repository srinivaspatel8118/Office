package setinterface;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

/*
 * 4. Write a program to add 5 string objects into Set reference and then print the objects in ascending order using 'cursors' & 'for each loop'.
 */
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s= new TreeSet<>();
		s.add("Balu");
		s.add("Patel");
		s.add("Gowtham");
		s.add("Nag");
		s.add("Nani");
	System.out.println("------Using  Itarator-------");
	Iterator<String> it=s.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("----------------Using splitarator----------------");
	Spliterator<String> spl=s.spliterator();
	spl.forEachRemaining(System.out::println);
	
	
	
	System.out.println("------Using foreach-------");
	for (String string : s)
		System.out.println(string);

	}

}
