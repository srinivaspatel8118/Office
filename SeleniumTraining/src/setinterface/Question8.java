package setinterface;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 8. Write a program for the following scenarios:
	a. Sort the user-defined class objects based on int value in descending order using Comparable interface and print them in console.
	
 */
public class Question8  implements Comparable<Question8> {

	int BillID;
	String BillNumber;
		
		@Override
		public int compareTo(Question8 o) {
			// TODO Auto-generated method stub
			return o.BillID-this.BillID;
		}
		
		public Question8(String BillNumber,int BillID)
		{
			this.BillID=BillID;
			this.BillNumber=BillNumber;
		}
		
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			ArrayList<Question8> al=new ArrayList<Question8>();
			al.add(new Question8("Bill1",1));
			al.add(new Question8("Bill2",2));
			al.add(new Question8("Bill3",33));
			al.add(new Question8("Bill5",55));
			al.add(new Question8("Bill4",4));
			
			Collections.sort(al);
			
		System.out.println("---------Using int Sorting-----------");
		for (Question8 que : al) {
			
			System.out.println(que.BillID+" "+que.BillNumber);
		}
			
		}
		
	}

