package setinterface;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class ComparatorFor12 implements Comparator<Patel3> {

	@Override
	public int compare(Patel3 arg0, Patel3 arg1) {
		// TODO Auto-generated method stub
		return new CompareToBuilder()
				.append(arg0.getBillNumer(), arg1.getBillNumer())
				.append(arg1.getBillName(),arg0.getBillName()).toComparison();
	}

}
