package setinterface;
/*
 * 7. Write a program for the following scenarios:
	a. Sort the user-defined class objects based on int value in ascending order using Comparable interface and print them in console.

 */
import java.util.ArrayList;
import java.util.Collections;

public class Question7  implements Comparable<Question7> {

	int BillID;
	String BillNumber;
		
		@Override
		public int compareTo(Question7 o) {
			// TODO Auto-generated method stub
			return this.BillID-o.BillID;
		}
		
		public Question7(String BillNumber,int BillID)
		{
			this.BillID=BillID;
			this.BillNumber=BillNumber;
		}
		
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			ArrayList<Question7> al=new ArrayList<Question7>();
			al.add(new Question7("Bill1",1));
			al.add(new Question7("Bill2",2));
			al.add(new Question7("Bill3",33));
			al.add(new Question7("Bill5",55));
			al.add(new Question7("Bill4",4));
			
			Collections.sort(al);
			
		System.out.println("---------Using int Sorting-----------");
		for (Question7 que : al) {
			
			System.out.println(que.BillID+" "+que.BillNumber);
		}
			
		}
		
	}

