package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * 5. Write a program to add 6 string objects into ArrayList and display all the data in console
 *  using for, for each, Iterator and ListIterator.
 */
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("Srinivas");
		ar1.add("Raju");
		ar1.add("Chaithu");
		ar1.add("Ashish");
		ar1.add("Ranjit");
		System.out.println("Using For Loop---------------");
		
		for (int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("Using For Each-------------");
		
		for (String str : ar1)
		System.out.println(str);
		
		System.out.println("Using  Itarator----------");
		
		Iterator<String> list1=ar1.iterator();
		while(list1.hasNext())
    	System.out.println(list1.next());
	
		System.out.println("Using List Itarator----------");
		
		ListIterator<String> list2=ar1.listIterator();
		while(list2.hasNext())
    	System.out.println(list2.next());
		
		
		
	}

}
