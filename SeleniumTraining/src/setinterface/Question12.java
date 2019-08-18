package setinterface;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 12. Write programs to sort the user-defined class objects based on first String attribute in ascending order
 * & second String attribute in descending order using Comparator interface and print them in console.
 */
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Patel3> al=new ArrayList<Patel3>();
		al.add(new Patel3("Bill1","Patel"));
		al.add(new Patel3("Bill2","Balu"));
		al.add(new Patel3("Bill4","Srinu"));
		al.add(new Patel3("Bill4","Nag"));
		al.add(new Patel3("Bill2","Chaithanya"));
		
		Collections.sort(al, new ComparatorFor12());
		for (Patel3 patel3 : al) {
			System.out.println(patel3.getBillNumer()+" "+patel3.getBillName());
		}
	}

}
class Patel3
{
	String BillNumer,BillName;
	
	Patel3(String BillNumer,String BillName)
	{
		this.BillNumer=BillNumer;
		this.BillName=BillName;
	}
	 public String getBillNumer() {
		return BillNumer;
	}

	public void setBillNumer(String billNumer) {
		BillNumer = billNumer;
	}

	public String getBillName() {
		return BillName;
	}

	public void setBillName(String billName) {
		BillName = billName;
	}

	
}
