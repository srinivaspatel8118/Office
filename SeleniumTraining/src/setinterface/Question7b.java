package setinterface;
/*
 * 7.b. Sort the user-defined class objects based on String value in ascending order using Comparable interface and print them in console.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Question7b implements Comparable<Question7b> {

	int BillID;
	String BillNumber;
		
		@Override
		public int compareTo(Question7b o) {
			// TODO Auto-generated method stub
			return this.BillNumber.compareTo(o.BillNumber);
			
		}
		
		public Question7b(String BillNumber,int BillID)
		{
			this.BillID=BillID;
			this.BillNumber=BillNumber;
		}
		
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			ArrayList<Question7b> al=new ArrayList<Question7b>();
			al.add(new Question7b("Bill1",1));
			al.add(new Question7b("Bill2",2));
			al.add(new Question7b("Bill3",33));
			al.add(new Question7b("Bill5",55));
			al.add(new Question7b("Bill4",4));
			
			Collections.sort(al);
			
		System.out.println("---------Using int Sorting-----------");
		for (Question7b que : al) {
			
			System.out.println(que.BillID+" "+que.BillNumber);
		}
			
		}
		
	}

 
