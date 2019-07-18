package javabasics;


/**
 Write a program to declare one instance variable & one static variable of string type with values 
 	and call those two variables in instance method and print the values in console.
 */
public class Question4 {

	String str1="first string";
	static String str2="Static String";
	
	public void instanceMethod()
	{
		System.out.println("instance string  is "+str1);
		System.out.println("Static string  is " +Question4.str2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 ref=new Question4();
		
		ref.instanceMethod();

	}

}
