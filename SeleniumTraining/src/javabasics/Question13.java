package javabasics;

/*
  Write a program to define static methods with return types int, boolean, String and call those methods, 
store the returned values in corresponding variables in main method & print the returned values.
 */

public class Question13 {

	static int methodInt(int i)
	{
		return i;
	}
	
	static boolean methodboolean(boolean i)
	{
		return i;
	}
	
	static String methodString(String s)
	{
		return s;
	}
	
	public static void main(String[] args) {
		
		int i=Question13.methodInt(10);
		boolean b=Question13.methodboolean(false);
		String str1=Question13.methodString("Srinivas Patel");
		System.out.println("Returned from static method int value i= "+i);
		System.out.println("Returned from static method Boolean value b= "+b);
		System.out.println("Returned from static method String value s= "+str1);

	}

}
