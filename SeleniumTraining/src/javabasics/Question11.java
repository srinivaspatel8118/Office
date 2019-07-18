package javabasics;

/*
 Write a program to declare two instance variables of type 'String' and assign the values of local variables 
 to those two instance variables using 'this' keyword. */

public class Question11 {

String str1, str2;
	
	public void method1(String a,String b)
	{
		this.str1=a;
		this.str2=b;
		System.out.println("instance string are "+str1+" "+str2);
	}
	
	public static void main(String[] args) {
		
		new Question9().method1("srinivas", "patel");
		
		}

}
