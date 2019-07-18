package javabasics;

/*
 8.Write programs for the following scenarios:
	a.Create a class (ex: Test3) with two instance variables of type 'int' and one instance method with return type 'String'.
	b.Create another class(ex: Test4) with one static method by returning above class (Test3) object and 
	call the instance members using returned object in main method.
 */
public class Test4 {

	static Test3 staticMethod()
	{
		System.out.println("Current class static method");
		
		return new Test3();
	}
	public static void main(String[] args) {
		Test3 t3=Test4.staticMethod();
		System.out.println("Instance variables of Test3 class are i= "+t3.i+" and j="+t3.j);
		System.out.println("The returned instance method from Test3 class is "+t3.instanceMethod("Java Learning"));
		
	}

}
