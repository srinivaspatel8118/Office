package mapInterface;

import java.util.TreeMap;

/*
 * 8. Write a program for the following scenarios:
	a. Add 5 entries of type String into TreeMap and delete the entry if the specified key is present in the TreeMap
	b. delete the entry if the specified value is present in the TreeMap

 */
public class Question8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,String> tr=new TreeMap<String,String>();
		tr.put("a1", "Patel");
		tr.put("a2", "Balu");
		tr.put("a3", "Srini");
		tr.put("a5", "Santosh");
		tr.put("a4", "Goutham");
		//deleting the entry if the specified key is present in the TreeMap
		
		if(tr.containsKey("a3"))
		{
			System.out.println(" specified Key is present");
			tr.remove("a3");
		}
		System.out.println("After deleting specified Key");
		System.out.println(tr.entrySet());
		
		//b. delete the entry if the specified value is present in the TreeMap
		
		if (tr.containsValue("Balu"));
		{
			tr.remove("a2");
		}
		
		System.out.println(tr.entrySet());
		
	
	}

}
