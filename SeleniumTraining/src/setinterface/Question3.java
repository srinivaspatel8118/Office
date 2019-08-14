package setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

/*
 * 3. Write a program to add 6 string objects into HashSet reference and then print the
 *  objects using Iterator and Spliterator cursors in the same insertion order.
 */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashSet<String> hs=new LinkedHashSet<>();
		hs.add("Patel");
		hs.add("Srinivas");
		hs.add("Raju");
		hs.add("Ranjith");
		hs.add("Balu");
		hs.add("Gowtham");
				
		Iterator<String> it= hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("----------------Using splitarator----------------");
		Spliterator<String> spl=hs.spliterator();
		spl.forEachRemaining(System.out::println);
		
	}

}
