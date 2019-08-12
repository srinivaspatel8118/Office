package setinterface;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 6. Write a program to add first 10 integers in HashSet using for loop and Delete all
 *  the integers except even numbers from the HashSet and then print the HashSet having even numbers in console.
 */
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs=new HashSet<>();
		for(int i=1;i<=10;i++)
		{
			hs.add(i);
		}
		System.out.println(hs);
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			int i=it.next();
			
			if(i%2!=0)
			{
			
				it.remove();
			}
		}
		System.out.println("After deleting Odd numbersl");
		System.out.println(hs);
		
	}

}
