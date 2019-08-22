package comparisons;

import java.util.HashMap;

/*
 * 10. Write a program to verify whether the entries of two HashMaps are equal or not using equals method in two ways.
 */
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm1=new HashMap<>();
		hm1.put("a1", "Patel");
		hm1.put("a2", "Balu");
		hm1.put("a3", "Srini");
		hm1.put("a5", "Santosh");
		hm1.put("a4", "Goutham");
		
		HashMap<String,String> hm2=new HashMap<>();
		hm2.put("a1", "Patel");
		hm2.put("a2", "Balu");
		hm2.put("a3", "Srini");
		hm2.put("a5", "Santosh");
		hm2.put("a4", "Goutham");
		
		System.out.println(" First wayUsing equals method  "+hm1.equals(hm2));
		System.out.println("using entry set equal "+hm1.entrySet().equals(hm2.entrySet()));
		
	}

}
