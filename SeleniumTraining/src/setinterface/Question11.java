package setinterface;
/*
 * 11. Write programs to sort the user-defined class objects based on two String attributes in ascending order using Comparator interface and print them in console.

(i.e., order by first String, second string asc).
 */
import java.util.ArrayList;
import java.util.Collections;

public class Question11 {


	public static void main(String[] args) {
		ArrayList<Patel2> al=new ArrayList<Patel2>();
		al.add(new Patel2("Bill1","Patel"));
		al.add(new Patel2("Bill2","Balu"));
		al.add(new Patel2("Bill4","Srinu"));
		al.add(new Patel2("Bill3","Nag"));
		al.add(new Patel2("Bill2","Chaithanya"));
		Collections.sort(al, new ComparatorFor11());
		for (Patel2 patel2 : al) {
			System.out.println(patel2.getBillNumer()+" "+patel2.getName());
		}
		
	}
}


class Patel2
{
String BillNumer,Name;

Patel2(String BillNumer,String Name)
{
	this.Name=Name;
	this.BillNumer=BillNumer;
}

public String getBillNumer() {
	return BillNumer;
}

public void setBillNumer(String billNumer) {
	BillNumer = billNumer;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}
}
