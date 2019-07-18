package javabasics;

/**Write a program to declare two instance variables and two static variables of string type with values and print the 
values of those variables in console. */

public class Question2 {

	 String str1="Balu", str2="Patel";
	static String str3="Srinivas", str4="Reddy";	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question2 ref=new Question2();
		
		System.out.println("Instances strings of a=" +ref.str1+ " b="+ref.str2);
		System.out.println("Static strings are are string1="+Question2.str3+" and String2="+Question2.str4);

	}

}
