package setinterface;

import java.util.ArrayList;

public class Question11 {


	public static void main(String[] args) {
		ArrayList<Patel2> al=new ArrayList<Patel2>();
		al.add(new Patel2("Bill1","Patel"));
		al.add(new Patel2("Bill2","Balu"));
		al.add(new Patel2("Bill3","Srinu"));
		al.add(new Patel2("Bill5","Nag"));
		al.add(new Patel2("Bill4","Chaithanya"));
		
		
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
