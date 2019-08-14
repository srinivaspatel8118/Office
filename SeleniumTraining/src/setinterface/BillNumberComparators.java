package setinterface;


import java.util.Comparator;

public class BillNumberComparators implements Comparator<Patel1> {

	
	@Override
	public int compare(Patel1 o1, Patel1 o2) {
		
		
		return o1.BillNumer.compareTo(o2.BillNumer);
	}

}
