package javabasics;

/*
 7 Write programs for the following scenarios:
	a.Create a class (ex: Test1) with two instance variables of type 'String' and one instance method.
	b.Create another class(ex: Test2) with one instance method by returning above class (Test1) object and 
		call the instance members using returned object in main method.
 */
public class Test2 {

	Test1 secondInstance()
	{
		System.out.println("current class instance Method");
		return new Test1();
		
	}
	public static void main(String[] args) {
		
		Test2 t2=new Test2();
		Test1 t1=t2.secondInstance();
		System.out.println("Instance variables of Test1 class are String1= "+t1.str1+" and String2="+t1.str2);
			t1.instancMethod();
	}

}
