package inhertenceConcept;
/*
 * 5.b.Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and 
 * define other one instance method with return type boolean & one static method
 */
public class Parent22 extends Parent11{

	boolean instanceMethod2()
	{
		boolean b=true;
		return b;
	}
	
	static void staticMethod2()
	{
		System.out.println("Parent22 class static method");
	}
	
}
