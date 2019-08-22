package comparisons;

/*
 * 11. Write a program for the following scenarios:
a. To verify whether all the keys of two HashMaps are equal or not.
b. To verify whether all the values of two HashMaps are equal or not.
 */
import java.util.ArrayList;
import java.util.HashMap;


public class Question11 {

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
		hm2.put("a3", "Srini");
		hm2.put("a2", "Balu");
		hm2.put("a5", "Santosh");
		hm2.put("a4", "Goutham");
		
		System.out.println("returns true if both key sets are equal");
		System.out.println(hm1.keySet().equals(hm2.keySet()));
		System.out.println("returns true if both values are equal");
		System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm2.values())));
		
	}

}
