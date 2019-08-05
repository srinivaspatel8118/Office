package arrayList;

import java.util.ArrayList;

/*
 *  1. Write a program for the following scenarios:
		a. Add 5 string objects into one ArrayList
		b. Insert one string object at 2nd position
		c. Delete the value at 3rd index
		d. Update the value at 3rd position with 1st index value
		e. Display the value of 4th position in console
		f. Display the count of objects available in ArrayList.
 */
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar1 = new ArrayList<>();
		//a. Add 5 string objects into one ArrayList
		ar1.add("Srinivas");
		ar1.add("Raju");
		ar1.add("Chaithu");
		ar1.add("Ashish");
		ar1.add("Ranjit");
		System.out.println("Array elements are "+ar1);
		
		//b. Insert one string object at 2nd position
		ar1.add(2, "Balu");
		System.out.println("Array after insertig  one more object at 2nd index");
		System.out.println(ar1);
		
		//c. Delete the value at 3rd index
		ar1.remove(3);
		System.out.println("Array after removing 3rd index object");
		System.out.println(ar1);
		
		//d. Update the value at 3rd position with 1st index value
		ar1.set(2,ar1.get(1));
		System.out.println("Array after updating 3rd position with first index");
		System.out.println(ar1);
		
		//e. Display the value of 4th position in console
		System.out.println("4th postion value is "+ar1.get(3));
		
		//f. Display the count of objects available in ArrayList.
		System.out.println("The total count of objects in Array "+ar1.size());
						
	}
	
	

}