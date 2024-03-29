package setinterface;
/*
 * 10. Write programs to sort the user-defined class objects based on String value in descending order in 2 possible ways using Comparator interface and print them in console
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question10
{public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Patel1> al=new ArrayList<Patel1>();
	al.add(new Patel1("Bill11",1));
	al.add(new Patel1("Bill2",2));
	al.add(new Patel1("Bill3",33));
	al.add(new Patel1("Bill5",55));
	al.add(new Patel1("Bill4",4));
	
	
	System.out.println("----- Using First way String ascending order-----");
	
	Collections.sort(al, new BillNumberDescComparator());
	
	//Collections.sort(al, Collections.reverseOrder(new BillNumberComparators()));
	
	for (Patel1 patel : al) {
		System.out.println(patel.getBillId()+" "+patel.getBillNumber());
	}

	System.out.println("----- Using second way String ascending order-----");
	
	
	
	Collections.sort(al, Collections.reverseOrder(new BillNumberComparators()));
	
	for (Patel1 patel : al) {
		System.out.println(patel.getBillId()+" "+patel.getBillNumber());
	}
}

}


class Patel1
	{
	String BillNumer;
	int BillID;
	
	Patel1(String BillNumer,int BillID)
	{
		this.BillID=BillID;
		this.BillNumer=BillNumer;
	}
	public int getBillId(){
		return BillID;
	}
	public String getBillNumber() {
		return BillNumer;
	}
	public void setBillNumber(String BillNumer) {
		this.BillNumer = BillNumer;
	}
	public void setBillId(int BillID){
		this.BillID=BillID;
	}
}
