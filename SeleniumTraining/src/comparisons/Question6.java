package comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * 6. Write a program to verify whether two Array Lists having String objects are equal or not using equals method.
 */
public class Question6 {

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
		
		ArrayList<String> unmatched=new ArrayList<String>();
		
		System.out.println("------Comparing ArrayList----");
		
		Iterator<String> itr=arr1.iterator();
		while(itr.hasNext())
			{
				String str=itr.next();
				if(arr2.remove(str))
				{
					itr.remove();
				}
							
			}
		
		unmatched.addAll(arr1);
		unmatched.addAll(arr2);
		System.out.println(unmatched);//if there is empty array then lists are equal
	}

}
