package setinterface;

import java.util.Comparator;

public class BillNumberDescComparator implements Comparator<Patel1> {

	
	@Override
	public int compare(Patel1 o1, Patel1 o2) {
		
		return o2.BillNumer.compareTo(o1.BillNumer);
		
	}

}
/*package collections;

import java.util.Comparator;

public class VendorComparator1_Name_Location implements Comparator<VendorComparator1>{
	String attribute;

	VendorComparator1_Name_Location(String attribute){
		this.attribute=attribute;
		
	}
	@Override
	public int compare(VendorComparator1 o1, VendorComparator1 o2) {
		switch(attribute){
		case "Vendorlocation": return o1.getVendorlocation().compareTo(o2.getVendorlocation());
		case "Vendorname": return o1.getVendorname().compareTo(o2.getVendorname());
		}
		return 0;
		
	}

}

*/