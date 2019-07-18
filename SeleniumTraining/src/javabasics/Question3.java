package javabasics;

/**Write a program to define one instance method and one static method and call those two methods in main method.
 */

public class Question3 {
	
	public void oneIntance()
	{
		System.out.println("Instance Method");
	}

	public static void staticMethod()
	{
		System.out.println("static Method");
	}
	public static void main(String[] args) {
	
		Question3 ref=new Question3();
		//calling instance method
		ref.oneIntance();
		//calling static method
		Question3.staticMethod();
		
	}

}
