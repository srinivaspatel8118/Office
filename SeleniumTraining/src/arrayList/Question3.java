package arrayList;

import java.util.ArrayList;

/*
 * 3. Write a program to store the list of objects from 1st index to 4th index from one ArrayList to another ArrayList
 */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("Srinivas");
		ar1.add("Raju");
		ar1.add("Chaithu");
		ar1.add("Ashish");
		ar1.add("Ranjit");
		ar1.add("Balu");
		
		
		ArrayList<String> ar2=new ArrayList<>();
		ar2.addAll(ar1.subList(1, 5));
		
		System.out.println("The final Array list is "+ar2);
	}

}
