package setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 14. Write programs to sort the user-defined class objects based on two String attributes in ascending order using comparing method of Comparator interface and print them in console.
	(i.e., order by first String, second string asc).

 
 */
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList<Patel5> al=new ArrayList<Patel5>();
				al.add(new Patel5("Bill1","Patel"));
				al.add(new Patel5("Bill2","Balu"));
				al.add(new Patel5("Bill4","Srinu"));
				al.add(new Patel5("Bill4","Nag"));
				al.add(new Patel5("Bill2","Chaithanya"));
				System.out.println("-------In ascending order------");
				Collections.sort(al,Comparator.comparing(Patel5::getStr1).thenComparing(Patel5::getStr2));
				for (Patel5 patel5 : al) {
					System.out.println(patel5.getStr1()+" "+patel5.getStr2());
				}
				System.out.println("-------In descending order------");
				Collections.sort(al,Comparator.comparing(Patel5::getStr1).thenComparing(Patel5::getStr2).reversed());
				for (Patel5 patel5 : al) {
					System.out.println(patel5.getStr1()+" "+patel5.getStr2());
				}
	}

}

class Patel5
{
	String str1,str2;
	
	Patel5(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
}
