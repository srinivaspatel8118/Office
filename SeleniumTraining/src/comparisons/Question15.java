package comparisons;
/*
 * 15. Write a program to delete the common entries from two maps using entriesInCommon() method and then print the unmatched entries
 from two maps individually in console.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import com.google.common.collect.MapDifference;
import com.google.common.collect.MapDifference.ValueDifference;
import com.google.common.collect.Maps;


public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm1=new HashMap<>();
		hm1.put("a1", "Patel");
		hm1.put("a2", "Balu");
		hm1.put("a3", "Srini");
		hm1.put("a5", "Santosh");
		hm1.put("a4", "Goutham");
		hm1.put("a7", "Goutham");
		
		HashMap<String,String> hm2=new HashMap<>();
		hm2.put("a1", "Patel");
		hm2.put("a2", "Balu");
		hm2.put("a3", "Srini");
		hm2.put("a5", "Santosh");
		hm2.put("a4", "Goutham");
		hm2.put("a6", "Goutham");
		
		MapDifference<String, String> df = Maps.difference(hm1,hm2);
		Map<String, String> common = df.entriesInCommon();
		System.out.println("Entrys in common "+common);
		
		
		Set<Entry<String, String>> set= common.entrySet();
		for(Entry<String, String> st:set){
			hm1.entrySet().remove(st);
			hm2.entrySet().remove(st);
			}
		if(hm1.size()>0 || hm2.size()>0){
			System.out.println("Unmatched data from first HashMap: "+hm1);
			System.out.println("Unmatched data from second HashMap: "+hm2);
		}
		
		else{
			System.out.println("maps are equalS");
		}
		
	}

}
