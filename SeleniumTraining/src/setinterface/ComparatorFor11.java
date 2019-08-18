package setinterface;


import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;
public class ComparatorFor11 implements Comparator<Patel2> {

	@Override
	public int compare(Patel2 o1, Patel2 o2) {
		// TODO Auto-generated method stub
		return new CompareToBuilder()
				.append(o1.getBillNumer(), o2.getBillNumer())
				.append(o1.getName(),o2.getName()).toComparison();
				
				
	}

}
