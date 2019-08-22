package comparisons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

/*
 * 13. Write a program to verify whether the entries of two Maps(Strings as key & value) are equal or not using Iterator cursor 
	and return the unmatched entries from two maps.
 */
public class Question13 {

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

		System.out.println(" using itarator if empty map then it is equal");
		Set<Entry<String, String>> entries=hm1.entrySet();
		Iterator<Entry<String, String>> itr= entries.iterator();
		while(itr.hasNext()){
			Entry<String, String> entry=itr.next();
			if(hm2.remove(entry.getKey(),entry.getValue())){
				hm1.remove(entry.getKey());
			}
		}
		
		HashMap<String,String> unmatched=new HashMap<>(hm1);
		unmatched.putAll(hm2);
		System.out.println(unmatched);
	}

}
