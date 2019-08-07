package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 9. Write a program for the following scenarios:
	a. Create one string array with 3 values and convert this array as ArrayList and then print the values from ArrayList individually.
	b. Add 4 string objects into one ArrayList and Convert this ArrayList as Array and then print the values from Array individually.
 */
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]= {"Srinivas","Patel","Reddy"};
		ArrayList<String> ar1= new ArrayList<String>(Arrays.asList(str));
		System.out.println("After converting Array to ArrayList");
		for(String str1:ar1)
			System.out.println(str1);
		
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("element1");
		ar2.add("element2");
		ar2.add("element4");
		ar2.add("element3");
		
		//b. Add 4 string objects into one ArrayList and Convert this ArrayList as Array and then print the values from Array individually.
		System.out.println("ArrayList into String array");
		String str3[]=new String[ar2.size()];
		ar2.toArray(str3);
		for (String string1 : str3) {
			System.out.println(string1);
		}
	}

}
