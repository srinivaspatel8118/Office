package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 12. Write a program to add all String objects from one ArrayList to other LinkedList 
 * 	without using addAll() and then print the objects of LinkedList in console.
 */
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("element1");
		ar1.add("element10");
		ar1.add("element3");
		ar1.add("element4");
		
		LinkedList<String> lk1=new LinkedList<>(ar1);
	System.out.println("Strin object which are copied to LinkeList from ArrayLists");
		System.out.println(lk1);
	}

}
