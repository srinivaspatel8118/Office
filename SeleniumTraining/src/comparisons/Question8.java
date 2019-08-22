package comparisons;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 8. Write a program to verify whether two ArrayLists having user-defined class objects are equal or not using Iterator cursor
 and return the unmatched objects from two lists.

 */
public class Question8 {

		
	public static ArrayList<userdefined3> usingItarator(ArrayList<userdefined3> a,ArrayList<userdefined3> b)
			{
				Iterator<userdefined3> itr=a.iterator();
				while(itr.hasNext())
				{
					userdefined3 str=itr.next();
					if(b.remove(str)){
						itr.remove();
					}
				}
				
			ArrayList<userdefined3> unmatched=new ArrayList<userdefined3>();
			unmatched.addAll(a);
			unmatched.addAll(b);
				return unmatched;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<userdefined3> arr1=new ArrayList<userdefined3>();
		
		arr1.add(new userdefined3( "Srinivas"));
		arr1.add(new userdefined3( "Patel"));
		arr1.add(new userdefined3( "Nagarjuna"));
		arr1.add(new userdefined3( "Gowtham"));
		
		ArrayList<userdefined3> arr2=new ArrayList<userdefined3>();
		
		arr2.add(new userdefined3( "Srinivas"));
		arr2.add(new userdefined3( "Patel"));
		arr2.add(new userdefined3( "Nagarjuna"));
		arr2.add(new userdefined3( "Gowtham"));
		arr2.add(new userdefined3( "pippalla"));
	
		System.out.println(arr1.equals(arr2));//true
		System.out.println("------Using itarator------");
		ArrayList<userdefined3> arr3= new ArrayList<userdefined3>(usingItarator(arr1,arr2));
		
		for (userdefined3 userdefined3 : arr3) {
			System.out.println("Unmatched element are " +userdefined3.str);
		}
			
			
			

	}
}
class userdefined3
{
	String str;
	
	userdefined3( String str)
	{
		this.str=str;
	}
	public boolean equals(Object obj)
	{
		userdefined3 ref=(userdefined3)obj;
		return this.str.equals(ref.str);
	}
}
