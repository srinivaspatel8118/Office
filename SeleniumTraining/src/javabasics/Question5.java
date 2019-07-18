package javabasics;

/**
Write a program to declare one instance variable & one static variable of string type with values and call those two 
	variables in static method and print the values in console.
 */

public class Question5 {
	
	String str1="first string";
	static String str2="Static String";
	
	public static void staticMethod()
	{
		Question5 ref=new Question5();
		System.out.println("instance string  is "+ref.str1);
		System.out.println("Static string  is " +Question4.str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question5.staticMethod();
	}

}
