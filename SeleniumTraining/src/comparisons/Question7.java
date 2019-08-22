package comparisons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * 7. Write a program to verify whether two ArrayLists having String objects are equal or not using
 ListIterator & Iterator cursors and return the unmatched objects from two lists.

 */
public class Question7 {
	
	public static ArrayList<String> usingItarator(ArrayList<String> a,ArrayList<String> b)
	{
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
			{
				String str=itr.next();
				if(b.remove(str))
				{
					itr.remove();
				}
							
			}
		ArrayList<String> unmatched=new ArrayList<String>();
		unmatched.addAll(a);
		unmatched.addAll(b);
		return unmatched;
	}

	
	public static ArrayList<String> usingListItarator(ArrayList<String> a,ArrayList<String> b)
	{
		ListIterator<String> itr=a.listIterator();
		while(itr.hasNext())
			{
				String str=itr.next();
				if(b.remove(str))
				{
					itr.remove();
				}
							
			}
		ArrayList<String> unmatched=new ArrayList<String>();
		unmatched.addAll(a);
		unmatched.addAll(b);
		return unmatched;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr1=new ArrayList<>();
		arr1.add("Srinivas");
		arr1.add("Raju");
		arr1.add("Balu");
		
		ArrayList<String> arr2=new ArrayList<>();
		arr2.add("Srinivas");
		arr2.add("Raju");
		arr2.add("Balu");
		
		
		System.out.println("------Comparing ArrayList using itarator----");
		System.out.println(usingItarator(arr1,arr2));//if there is empty array then lists are equal
		
		System.out.println("------Comparing ArrayList using ListItarator----");
		System.out.println(usingItarator(arr1,arr2));//if there is empty array then lists are equal

		}
	}


