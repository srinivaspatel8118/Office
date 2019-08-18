package setinterface;

import java.util.Comparator;

public class BillNumberDescComparator implements Comparator<Patel1> {

	
	@Override
	public int compare(Patel1 o1, Patel1 o2) {
		
		return o2.BillNumer.compareTo(o1.BillNumer);
		
	}

}
