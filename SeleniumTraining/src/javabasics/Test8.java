package javabasics;
/*
 10.Write programs for the following scenarios:
	a.Create a class (ex: Test7) with two instance variables of type 'String' and one instance method with return type 'boolean'.
	b.Create another class(ex: Test8) with one static method by passing above class (Test7) object as parameter and
 	call the instance members of 'Test7' class in Static method.
 */

public class Test8 {
	
	static void staticMethod(Test7 t7)
	{
		System.out.println("instance varibales of Test6 are string1="+t7.str1+" and String2= "+t7.str2);
		System.out.println("The returned boolean values from Test7 is "+t7.methodboolean());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8.staticMethod(new Test7());
	}

}
