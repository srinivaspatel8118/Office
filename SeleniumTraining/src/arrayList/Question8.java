package arrayList;
/*
 * 8. Write a program for the following scenarios:
	a. Add 7 string objects into one ArrayList
	b. Display all the objects in ascending order
	c. Display all the objects in descending order using 2 possible approaches.
 */
import java.util.ArrayList;
import java.util.Collections;


public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("element1");
		ar1.add("element2");
		ar1.add("element4");
		ar1.add("element3");
		ar1.add("element7");
		ar1.add("element5");
		ar1.add("element6");
		
		//b. Display all the objects in ascending order
		Collections.sort(ar1);
		System.out.println("Array list sorted in ascending order");
		System.out.println(ar1);
		
		//c. Display all the objects in descending order using 2 possible approaches.
		Collections.reverse(ar1);
		System.out.println("Array list sorted in decending order First Approach");
		System.out.println(ar1);
		
		System.out.println("Array list sorted in decending order second Approach");
		Collections.sort(ar1,Collections.reverseOrder());
		System.out.println(ar1);
	}

}
