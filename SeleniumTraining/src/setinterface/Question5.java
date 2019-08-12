package setinterface;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 5. Write a program to add 6 string objects into TreeSet and print first & last objects and then 
 * delete them from TreeSet and also, print all remaining objects of TreeSet using Iterator.
 */
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> tr=new TreeSet<>();
		tr.add("Balu");
		tr.add("Patel");
		tr.add("Gowtham");
		tr.add("Nag");
		tr.add("Nani");
		System.out.println(tr);
		System.out.println("The first object is "+tr.first());
		System.out.println("The last object is "+tr.last());
		tr.remove(tr.first());
		tr.remove(tr.last());

		System.out.println("----Printning objects using itarator----------");
		Iterator<String> it=tr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
	}

}
