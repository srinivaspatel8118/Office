package arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 7. Write a program for the following scenarios:
	a. Add 4 string objects (ex: element1, element10, element3, element4) into one ArrayList
	b. Add one more string object(ex: element5) in above ArrayList using ListIterator
	c. Update the value "element10" with "element2" using ListIterator
	d. Delete the value at last position using ListIterator
 */
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a. Add 4 string objects (ex: element1, element10, element3, element4) into one ArrayList
		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("element1");
		ar1.add("element10");
		ar1.add("element3");
		ar1.add("element4");
		System.out.println("default array is ");
		System.out.println(ar1);
		
	//b. Add one more string object(ex: element5) in above ArrayList using ListIterator
		ListIterator<String> lr1=ar1.listIterator();
		lr1.add("Patel");
		System.out.println("Array list after adding one more object using List Itereator");
		System.out.println(ar1);
		
	//c. Update the value "element10" with "element2" using ListIterator
		
		System.out.println("After replacing array  element10 with element2 using ListIterator ");
		
		while(lr1.hasNext())
		{
			String str=lr1.next();
			if(str.equals("Element10"))
			{
				lr1.remove();
				lr1.set("Element2");
			
			}
			
		}
		System.out.println(ar1);
	//d. Delete the value at last position using ListIterator

		System.out.println("after deleting the last position using listiterator");
		ListIterator<String> lr2=ar1.listIterator();
		while(lr2.hasNext())

		{
			String str=lr2.next();
			if(str.equals(ar1.get(ar1.size()-1)))
			{
				lr2.remove();
			}
		}
	System.out.println(ar1);
	}

}
