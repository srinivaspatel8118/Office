package mapInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * 7. Write a program to Add 5 entries of type String into TreeMap and then print all the keys & values using Iterator and for each.
 */
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,String> tr=new TreeMap<String,String>();
		tr.put("a1", "Patel");
		tr.put("a2", "Balu");
		tr.put("a3", "Srini");
		tr.put("a5", "Santosh");
		tr.put("a4", "Goutham");
		
		System.out.println("--------Using itarator----");
		 Set<Entry<String, String>> set= tr.entrySet();
	      Iterator<Entry<String, String>> itr=set.iterator();
	      while(itr.hasNext())
	      {
	    	Entry<String, String> entry= itr.next();
	    	  System.out.println(entry.getKey()+" "+entry.getValue());
	      }
	      
	      System.out.println("-------Using ForEach--------");
	      for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	      
		
	}

}
