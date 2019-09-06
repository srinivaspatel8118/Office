package javabasics;

/*Write a program to define instance methods with return types int, boolean, String and call those methods, store the returned values 
 * in corresponding variables in main method & print the returned values.*/

public class Question12 {
	
	int methodInt(int i)
	{
		return i;
	}
	
	boolean methodboolean(boolean i)
	{
		return i;
	}
	
	String methodString(String s)
	{
		return s;
	}
	
	public static void main(String[] args) {
		
		Question12 ref=new Question12();
				int i=ref.methodInt(10);
				boolean b=ref.methodboolean(false);
				String str=ref.methodString("Patel");
				System.out.println("Returned int value i= "+ref.methodInt(10));
				System.out.println("Returned Boolean value b= "+b);
				System.out.println("Returned String value s= "+str);
	}

}
