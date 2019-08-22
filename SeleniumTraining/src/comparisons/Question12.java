package comparisons;
/*
 * 12. Write a program to verify whether the entries of two HashMaps having String as key and user-defined class object as value are equal or not.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Search> hm1=new HashMap<>();
		hm1.put("Firstone", new Search(1,"Balu"));
		hm1.put("Secondone", new Search(2,"BaluPatel"));
		
		HashMap<String,Search> hm2=new HashMap<>();
		hm2.put("Firstone", new Search(1,"Balu"));
		hm2.put("Secondone", new Search(2,"BaluPatel"));
		
		System.out.println("returns true if arrays are quals "+hm1.entrySet().equals(hm2.entrySet()));
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
	
	
	@Override
	public boolean equals(Object obj){
		//typecast obj to Expense so that we can compare Expenses 
		Search ser=(Search)obj;
		return this.i==ser.i && this.str.equals(ser.str);
	}
	
}