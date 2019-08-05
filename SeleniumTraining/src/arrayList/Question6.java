package arrayList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/*
 * 6. Write a program to add 3 string objects into Vector and display all the data in console using all possible ways.
 */
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vc1=new Vector<>();
		vc1.add("Nag");
		vc1.add("Ramu");
		vc1.add("raj");
		
		System.out.println("Using For Loop---------------");
		
		for (int i=0;i<vc1.size();i++)
		{
			System.out.println(vc1.get(i));
		}
		
		System.out.println("Using For Each-------------");
		
		for (String str : vc1)
			System.out.println(str);
			
		System.out.println("Using Enumeration------------");
		
		Enumeration<String> enum1 = vc1.elements();
		while(enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement());
		}
		 
			System.out.println("Using  Itarator----------");
			
			Iterator<String> list1=vc1.iterator();
			while(list1.hasNext())
	    	System.out.println(list1.next());
		
			System.out.println("Using List Itarator----------");
			
			ListIterator<String> list2=vc1.listIterator();
			while(list2.hasNext())
	    	System.out.println(list2.next());
	}

}
