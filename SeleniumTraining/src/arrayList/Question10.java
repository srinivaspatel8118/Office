package arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 10. Write a program to add first 10 integers in ArrayList using for loop and Delete all the integers
 * 	 except even numbers from the ArrayList and then print the ArrayList having even numbers in console.
 */
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar1=new ArrayList<>();
		
		for(int i=0;i<10;i++)
		{
			ar1.add(i);
		}
		System.out.println(ar1);
		
		
		ListIterator<Integer> lr1=ar1.listIterator();
		while(lr1.hasNext())
		{
			int i=lr1.next();
			
			if(i%2!=0)
			{
			
				lr1.remove();
			}
			
			
		}
		System.out.println("Printing arrayList which has only even numbers");
		System.out.println(ar1);
		
		
	}

}
