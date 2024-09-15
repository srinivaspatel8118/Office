package arrayList;

/*
 * 4. Write a program for the following scenarios:
		a. Delete all the objects from fist ArrayList that are contained in second ArrayList
		b. Delete all the objects from fist ArrayList that are NOT contained in second ArrayList
 */
import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("Srinivas");
		ar1.add("Raju");
		ar1.add("Chaithu");
		ar1.add("Ashish");
		ar1.add("Ranjit");
		
		ArrayList<String> ar2=new ArrayList<>();
		ar2.add("Patel");
		ar2.add("Ashish");
		ar2.add("Mohan");
		ar2.add("vishnu");
		ar2.add("Raju");
		ar2.add("Srinivas Patel");	
		//a. Delete all the objects from fist ArrayList that are contained in second ArrayList
				ar1.removeAll(ar2);
				System.out.println("Array after deleting the objects from fist ArrayList that are contained in second ArrayList");
				System.out.println(ar1);
		//b. Delete all the objects from fist ArrayList that are NOT contained in second ArrayList
		/*
		 * ar1.retainAll(ar2); System.out.
		 * println("Aray after deleting all the objects from fist ArrayList that are NOT contained in second ArrayList"
		 * ); System.out.println(ar1);
		 */	
	}

}
