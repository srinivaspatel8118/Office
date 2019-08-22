package comparisons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

/*
 * 14. Write a program to implement common method to compare two specified maps & return the unmatched entries and 
then call this method in main method to verify whether there are any unmatched entries existed in specified maps.

 */
public class Question14 {
	
	public static ConcurrentHashMap<String,String> usingItarator(ConcurrentHashMap<String,String> a,ConcurrentHashMap<String,String> b)
	{
		Set<Entry<String, String>> entries=a.entrySet();
		Iterator<Entry<String, String>> itr= entries.iterator();
		while(itr.hasNext()){
			Entry<String, String> entry=itr.next();
			if(b.remove(entry.getKey(),entry.getValue())){
				a.remove(entry.getKey());
			}
		}
		
		HashMap<String,String> unmatched=new HashMap<>(a);
		unmatched.putAll(b);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<String,String> hm1=new ConcurrentHashMap<>();
		hm1.put("a1", "Patel");
		hm1.put("a2", "Balu");
		hm1.put("a3", "Srini");
		hm1.put("a5", "Santosh");
		hm1.put("a4", "Goutham");
		
		ConcurrentHashMap<String,String> hm2=new ConcurrentHashMap<>();
		hm2.put("a1", "Patel");
		hm2.put("a2", "Balu");
		hm2.put("a3", "Srini");
		hm2.put("a5", "Santosh");
		hm2.put("a4", "Goutham");
		
		HashMap<String,String> unmatched= new HashMap<String,String>(usingItarator(hm1,hm2));
		System.out.println("Returns empty if equal "+unmatched);
	}

}
