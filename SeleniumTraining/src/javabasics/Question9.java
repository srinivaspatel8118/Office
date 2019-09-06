package javabasics;

/*
 * Write a program to declare two instance variables of type 'String' and assign the values of local variables to those two
 	instance variables using 'this' keyword.
 */
public class Question9 {

	String str1, str2;
	
	public void method1(String a,String b)
	{
		this.str1=a;
		this.str2=b;
		System.out.println("instance string are "+str1+" "+str2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question9 ref= new Question9();
		ref.method1("srinivas", "patel");
		
	}

}
