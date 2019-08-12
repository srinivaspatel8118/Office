package setinterface;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 8b.Sort the user-defined class objects based on String value in descending order using Comparable interface and print them in console.
 */
public class Question8b implements Comparable<Question8b> {

	int BillID;
	String BillNumber;
		
		@Override
		public int compareTo(Question8b o) {
			// TODO Auto-generated method stub
			return o.BillNumber.compareTo(this.BillNumber);
			
		}
		
		public Question8b(String BillNumber,int BillID)
		{
			this.BillID=BillID;
			this.BillNumber=BillNumber;
		}
		
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			ArrayList<Question8b> al=new ArrayList<Question8b>();
			al.add(new Question8b("Bill1",1));
			al.add(new Question8b("Bill2",2));
			al.add(new Question8b("Bill3",33));
			al.add(new Question8b("Bill5",55));
			al.add(new Question8b("Bill4",4));
			
			Collections.sort(al);
			
		System.out.println("---------Using int Sorting-----------");
		for (Question8b que : al) {
			
			System.out.println(que.BillID+" "+que.BillNumber);
		}
			
		}
		
	}

 
