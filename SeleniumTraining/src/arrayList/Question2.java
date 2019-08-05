package arrayList;

import java.util.ArrayList;

/*
 * 2. Write a program to add objects of two ArrayLists into another ArrayList.
 */
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("Srinivas");
		ar1.add("Raju");
		ar1.add("Chaithu");
		ar1.add("Ashish");
		ar1.add("Ranjit");
		
		ArrayList<String> ar2=new ArrayList<>();
		ar2.add("Patel");
		ar2.add("Balu");
		ar2.add("Mohan");
		ar2.add("vishnu");
		ar2.add("Ellar");
		
		ArrayList<String> ar3=new ArrayList<>();
		ar3.addAll(ar1);
		ar3.addAll(ar2);
		
		System.out.println("The final array is ");
		System.out.println(ar3);
	}

}
