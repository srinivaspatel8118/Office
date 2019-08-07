package arrayList;
/*
 * 11. Write a program for the following scenarios:
		a. Add 4 string objects into one LinkedList
		b. Add one object at first position and last position
		c. Delete the object at 3rd position
		d. Update the value at 4th position with 2nd index value

 */
import java.util.LinkedList;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a. Add 4 string objects into one LinkedList
		LinkedList<String> lk1=new LinkedList<>();
		lk1.add("Nagarjuna");
		lk1.add("Patel");
		lk1.add("Gowtham");
		lk1.add("Rajitha");
		
		System.out.println("After adding linkied list");
		System.out.println(lk1);
		
		//	b. Add one object at first position and last position
		lk1.add(0,"Chaitanya");
		lk1.add("Mohan");
		System.out.println("After adding first position and last position linkied list");
		System.out.println(lk1);
		
		//c. Delete the object at 3rd position
		lk1.remove(2);
		System.out.println("After removing 3rd postion linkied list");
		System.out.println(lk1);
		
		//d. Update the value at 4th position with 2nd index value
		lk1.set(3,lk1.get(2));
		System.out.println("After Updating the value at 4th position with 2nd index value linkied list");
		System.out.println(lk1);
	}

}
