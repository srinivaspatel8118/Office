package javabasics;

/*
 Write a program to define one instance method & one static method by returning local variable and 
print the returned values in console.
 */
public class Question15 {
	
	int methodInt()
	{
		 int i=50;
		 return i;
	}
	
	static String methodString()
	{
		String str="Local Variable";
		return str;
	}

	public static void main(String[] args) {
		
		System.out.println("The returned value from instance method is " +new Question15().methodInt());
		System.out.println("The returned value from static method is " +Question15.methodString());
	}

}
