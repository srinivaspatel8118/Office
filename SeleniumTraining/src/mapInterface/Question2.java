package mapInterface;

import java.util.Collection;
import java.util.HashMap;

/*
 * 2. Write a program to Add 7 entries of type String into HashMap and then print all the values in 3 possible ways.
 */
public class Question2 {

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
		System.out.println("First possible way "+hm.values());
		
		System.out.println("---- Second possible way--------");
		Collection<String> c=hm.values();
		for(String str:c)
			System.out.println(str);
		
		
		
		System.out.println("------Third Possible way-------");
		hm.values().stream().forEach((Values)->System.out.println(Values));
	}

}
