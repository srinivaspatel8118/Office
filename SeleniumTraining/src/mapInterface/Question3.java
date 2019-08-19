package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 3. Write a program to add all objects from one HashMap to other HashMap using 2 possible ways 
 * and then print all the keys & values of second HashMap in console using Iterator.
 */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm=new HashMap<>();
		hm.put("a1", "Patel");
		hm.put("a2", "Balu");
		hm.put("a3", "Srini");
		hm.put("a5", "Santosh");
		hm.put("a4", "Goutham");
		hm.put("a7", "Ravi");
		hm.put("a6", "kanaka");
		
		// First possible way
		//HashMap<String,String> hm2=new HashMap<>(hm);
		
		//Second possible way
		HashMap<String,String> hm2=new HashMap<>();
		hm2.putAll(hm);
		
		System.out.println("--Displaying values Using itarator");
				Set<Entry<String,String>> set=hm2.entrySet();
				Iterator<Entry<String, String>> itr=set.iterator();
				while(itr.hasNext()){
					Map.Entry<String, String> entry= itr.next();
					System.out.println("Key= "+entry.getKey()+", Value= "+entry.getValue());
				}
	}

}
