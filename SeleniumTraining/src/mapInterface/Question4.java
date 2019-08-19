package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 4. Write a program for the following scenarios:
	a. Create a class (ex: Search) and define two instance variables of type int & String respectively and initialize the values using constructor
	b. Create another class (ex: HashMapDemo) and add two entries of type String & Search (i.e., String key and Search object as value) 
		and print all the keys & values of HashMap using Iterator and for each.

 */
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Search> hm=new HashMap<>();
		hm.put("Firstone", new Search(1,"Balu"));
		hm.put("Secondone", new Search(2,"BaluPatel"));
	System.out.println("-----Using Iterator----");
	Set<Entry<String,Search>> set=hm.entrySet();
	Iterator<Entry<String,Search>> itr=set.iterator();
	while(itr.hasNext())
		{
		Map.Entry<String,Search> map=itr.next();
		System.out.println("Key: "+map.getKey());
		
		Search ser=map.getValue();
		System.out.println(ser.i+" "+ser.str);
		}
	
	System.out.println("-------Using ForEach-------");
	for (Map.Entry<String, Search> entry : set) 
	{
		System.out.println(entry.getKey());
		System.out.println(entry.getValue().i+" "+entry.getValue().str);
	}
	
	}

}

class Search
{
	int i;
	String str;
	
	Search(int i,String str)
	{
		this.i=i;
		this.str=str;
	}
}