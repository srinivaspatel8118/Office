package javabasics;

/*
 Write a program to define one instance method with return type boolean & one static method with return type String
 and call those methods, store the returned values in corresponding variables in main method & print the returned values.
 */
public class Question14 {
	
	 boolean methodboolean()
	{
		 boolean i=true;
		 return i;
	}
	
	static String methodString()
	{
		String str="Local Variable";
		return str;
	}
	
	public static void main(String[] args) {
		boolean valid=new Question14().methodboolean();//Calling instance method
		System.out.println("The boolean value from instance method is "+valid);//true
		String str1=Question14.methodString();//Calling static method
		System.out.println("The String value from static method is "+str1);//Local Variable
		
	}

}
