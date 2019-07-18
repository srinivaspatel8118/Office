package javabasics;
/*
 9.Write programs for the following scenarios:
	a.Create a class (ex: Test5) with two instance variables of type 'String' and one instance method.
	b.Create another class(ex: Test6) with one instance method by passing above class (Test5) object as parameter
 		and call the instance members of 'Test5' class in instance method.
 */

public class Test6 {
	
	void instanceMethod1(Test5 t5) 
	{
		System.out.println("instance varibales of Test5 are string1="+t5.str1+" and String2= "+t5.str2);
		t5.instancMethod();//Calling Test5 class instance method
	}

	public static void main(String[] args) {
		
		new Test6().instanceMethod1(new Test5());

	}

}
