package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 5. Write a program for the following scenarios:
a. Create a class (ex: Search) and define two instance methods
b. Create another class (ex: HashMapDemo) and add one entry of type String & Search (i.e., String key and 
Search object as value) and get the value based on key and then call the methods using returned object reference.

 */
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Search1> hm=new HashMap<>();
		hm.put("Firstone", new Search1());
		
		//hm.get("Firstone").method1();
		//hm.get("Firstone").method2();
	
		
		Search1 ser=hm.get("Firstone");
		ser.method1();
		ser.method2();
		
		
		
	}

}

class Search1
{
	void method1()
	{
		System.out.println("Method1");
	}
	void method2()
	{
		System.out.println("Method2");
	}
}
