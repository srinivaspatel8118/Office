package comparisons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 9. Write a program to implement common method to compare two specified lists & return the unmatched objects and then
 call this method in main method to verify whether there are any unmatched objects existed in specified lists.
 */
public class Question9 {

	public static ArrayList<String> usingListItarator(List<String> a,List<String> b)
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
		
		List<String> list1=new ArrayList<>();
		list1.add("Srinivas");
		list1.add("Raju");
		list1.add("Balu");
		
		List<String> list2=new ArrayList<>();
		list2.add("Srinivas");
		list2.add("Raju");
		list2.add("Balu");

		System.out.println("Empty arraylist inserted if lists are equal");
		System.out.println(usingListItarator(list1,list2));
	}

}
