package polymorphism;
/*
 * 2.Write a program to define 3 static methods with same name and single argument 
 * and then call all the 3 methods in main method.
 */
public class Question2 {

	static void sameMethod(int i)
	{
		System.out.println("int argument method");
	}
	static void sameMethod(String str)
	{
		System.out.println("String argument method");
	}
	static void sameMethod(double d)
	{
		System.out.println("Double argument method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2.sameMethod(1);
		Question2.sameMethod("srinivas");
		Question2.sameMethod(10.25);
	}

}
