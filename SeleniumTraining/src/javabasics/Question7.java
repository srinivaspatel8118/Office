package javabasics;

/**
Write a program to define two instance methods & one static method and call those two instance methods in static method.
 */
public class Question7 {
	
	public void intanceMethod1()
	{
		System.out.println("first instance method");
	}
	public void intanceMethod2()
	{
		System.out.println("second instance method");
	}
	
	public static void staticMethod()
	{
		//object creation to call instance methods in static context
		Question7 ref=new Question7();
		ref.intanceMethod1();
		ref.intanceMethod2();
		System.out.println("static Method");
	}

	public static void main(String[] args) {
		
		Question7.staticMethod();
	}

}
