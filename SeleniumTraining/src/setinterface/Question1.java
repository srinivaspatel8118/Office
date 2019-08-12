package setinterface;
/*
 * 1.Write a program to add 5 string objects into HashSet and then print the objects using Iterator and Spliterator cursors.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<>();
		hs.add("Patel");
		hs.add("Srinivas");
		hs.add("Raju");
		hs.add("Ranjith");
		hs.add("Balu");
				
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
