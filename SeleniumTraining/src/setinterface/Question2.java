package setinterface;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 2. Write a program to add all String objects from one HashSet to other HashSet without using addAll()
 *  and then print the objects of second HashSet in console.
 */
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashSet<String> hs=new HashSet<>();
		hs.add("Patel");
		hs.add("Srinivas");
		hs.add("Raju");
		hs.add("Ranjith");
		hs.add("Balu");
		
		HashSet<String> hs1=new HashSet<>(hs);
		System.out.println("-----------Prnting using second hashset---------");
		Iterator<String> it=hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
