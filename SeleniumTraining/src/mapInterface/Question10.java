package mapInterface;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 10. Write a program to Add 5 entries of type String into Hashtable and then print all the keys & values using Iterator, Enumeration and for each.
 */
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("a1", "Patel");
		ht.put("a2", "Balu");
		ht.put("a3", "Srini");
		ht.put("a5", "Santosh");
		ht.put("a4", "Goutham");
		
		
		System.out.println("------Using Iterator------");
		 Set<Entry<String, String>> set=ht.entrySet();
		 Iterator<Entry<String, String>> itr=set.iterator();
		 while(itr.hasNext()){
			 Entry<String, String> ent=itr.next();
			 System.out.println(ent.getKey()+" "+ent.getValue());
		 }
		 
		 System.out.println("------Using ForEach------"); 
		 for (Entry<String, String> entry : set) 
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		 
		 System.out.println("------Using Enumaration------");
		 Enumeration<String> keys=ht.keys();
		 String key;
		 while(keys.hasMoreElements())
		 {
			 key=keys.nextElement();
			 System.out.println(key+" "+ht.get(key));
		 }
	}

}
