package setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * 9. Write programs to sort the user-defined class objects based on String value in ascending order using Comparator interface and print them in console.
 */
public class Question9 
{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Patel> al=new ArrayList<Patel>();
	al.add(new Patel("Bill1",1));
	al.add(new Patel("Bill2",2));
	al.add(new Patel("Bill3",33));
	al.add(new Patel("Bill5",55));
	al.add(new Patel("Bill4",4));
	
	
	System.out.println("----- Using String ascending order-----");
	
	//Collections.sort(al, new BillNumberComparator());
	
	Collections.sort(al, Comparator.comparing(Patel::getBillId));

	for (Patel patel : al) {
		System.out.println(patel.getBillId()+" "+patel.getBillNumber());
	}
	
}

}


class Patel
{
String BillNumer;
int BillID;

Patel(String BillNumer,int BillID)
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
