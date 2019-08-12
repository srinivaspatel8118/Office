package setinterface;

import java.util.Comparator;


public class BillNumberComparator implements Comparator<Patel>{


	public int compare(Patel o1, Patel o2) {
		// TODO Auto-generated method stub
		return o1.BillNumer.compareTo(o2.BillNumer);
	}

	
}
