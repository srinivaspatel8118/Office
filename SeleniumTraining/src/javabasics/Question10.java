package javabasics;

/**
 Write a program to define two instance methods with parameters and call those two methods in main method.
 */
public class Question10 {

	public void method1(String a,int b)
	{
		System.out.println("instance string are "+a+" "+b);
	}
	
	public void method1(int a,String b)
	{
		System.out.println("instance string are "+a+" "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question10 ref= new Question10();
		ref.method1("srinivas",2737);
		ref.method1(8118,"Patel");
	}

}
