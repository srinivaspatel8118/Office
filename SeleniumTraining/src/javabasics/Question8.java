package javabasics;
/**
 Write a program to define two static methods & one instance method and call those two static methods in instance method.
 */

public class Question8 {
	
	public static void staticMethod1()
	{
		System.out.println("First static Method");
	}
	
	public static void staticMethod2()
	{
		System.out.println("Second static Method");
	}

	public void intanceMethod()
	{
		Question8.staticMethod1();
		Question8.staticMethod2();
		System.out.println("Instance method");
	}
	public static void main(String[] args) {
	
		Question8 ref=new Question8();
		ref.intanceMethod();

	}

}
