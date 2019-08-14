package setinterface;

import java.util.Comparator;

public class Comparator10 implements Comparator<Patel2> {

	@Override
	public int compare(Patel2 o1, Patel2 o2) {
		// TODO Auto-generated method stub
		return o1.BillNumer.compareTo(o2.getBillNumer());
	}

	


}
