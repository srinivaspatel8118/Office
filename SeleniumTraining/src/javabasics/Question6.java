package javabasics;

/**
Write a program to define one instance and one static method with return type 'String' and print the returned value in console.
 */

public class Question6 {
	
	
	public String intanceMethod()
	{
		String str1="Instance string";
		return str1;
	}

	public static String staticMethod()
	{
		String str1="Static string";
		return str1;
	}

	public static void main(String[] args) {
		Question6 ref=new Question6();
		
		System.out.println("Instance method string is "+ref.intanceMethod());
		System.out.println("Static method string is "+Question6.staticMethod());
		
	}

}
