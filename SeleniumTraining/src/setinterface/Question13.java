package setinterface;
/*
 * 13. Write programs to sort the user-defined class objects based on String value in ascending
 *  & descending order using comparing method of Comparator interface and print them in console.

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Patel4> al=new ArrayList<Patel4>();
		al.add(new Patel4("Patel"));
		al.add(new Patel4("Balu"));
		al.add(new Patel4("Srinu"));
		al.add(new Patel4("Nag"));
		al.add(new Patel4("Chaithanya"));
		System.out.println("-------In ascending order------");
		Collections.sort(al,Comparator.comparing(Patel4::getStr1));
		for (Patel4 patel4 : al) {
			System.out.println(patel4.getStr1());
		}
		System.out.println("-------In descending order------");
		Collections.sort(al,Comparator.comparing(Patel4::getStr1).reversed());
		for (Patel4 patel4 : al) {
			System.out.println(patel4.getStr1());
		}
	}

}

class Patel4
{
	String Str1;
	Patel4(String Str1)
	{
		this.Str1=Str1;
	}
	public String getStr1() {
		return Str1;
	}
	public void setStr1(String str1) {
		Str1 = str1;
	}
	
}