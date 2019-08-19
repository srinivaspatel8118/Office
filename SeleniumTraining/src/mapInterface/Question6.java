package mapInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * 6. Write a program to Add 5 entries of type String into LinkedHashMap and then print all the keys & values using for each and Iterator.
 */
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
		
		lhm.put("a1", "Patel");
		lhm.put("a2", "Balu");
		lhm.put("a3", "Srini");
		lhm.put("a5", "Santosh");
		lhm.put("a4", "Goutham");
		
		
		System.out.println("------Keys Using ForEach-------");
		Set<Entry<String,String>> set=lhm.entrySet();
		
		for (Map.Entry<String, String> entry : set) {
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println("----Using Itarator");
		Iterator<Entry<String, String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> m = itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
	}

}
