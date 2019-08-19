package mapInterface;

import java.util.HashMap;
import java.util.Set;

/*
 * 1. Write a program to Add 7 entries of type String into HashMap and then print all the keys in 3 possible ways.
 */
public class Question1 {

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
	
		System.out.println("Using first way Keys present in HashMap "+hm.keySet());
		
		System.out.println("keys Using Stream");
		hm.keySet().stream().forEach((value)->System.out.println(value));
		
		System.out.println("----- Using foreach-----");
		Set<String> st=hm.keySet();
		for(String s:st)
		{
			System.out.println(s);
		}

	}
	
}
