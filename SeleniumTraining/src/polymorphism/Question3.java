package polymorphism;
/*
 * 3.Write a program to define 2 instance methods and 2 static methods with same name and two arguments 
 * and then call all the 4 methods in main method.
 */
public class Question3 {

	static void sameMethod(int i, String str)
	{
		System.out.println("static method of int and string");
	}
	static void sameMethod(String str, int i)
	{
		System.out.println("static method of string and int");
	}
	void sameMethod(int i,double d)
	{
		System.out.println("instance method of int and double");
	}
	void sameMethod(double d, int i)
	{
		System.out.println("instance method of double and int");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question3 q3=new Question3();
		Question3.sameMethod(10, "srinivas");
		Question3.sameMethod("patel", 120);
		q3.sameMethod(0.5, 11);
		q3.sameMethod(10,10.5);
		
	}

}
