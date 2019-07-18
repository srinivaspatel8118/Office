package inhertenceConcept;
/*
 * 1.Write programs for the following scenarios:
		a. Create a parent class (ex:Parent1) with two instance methods
		b.  Create a child class (ex:Child1) by inheriting above Parent class and define other two instance methods
		 and then call all the parent and child class methods in main method
 */

public class Child1 extends Parent1 {
	
	
	void method3()
	{
		System.out.println("method3 from child");
	}
	void method4()
	{
		System.out.println("method4 from child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 ch =new  Child1();
		ch.method1();
		ch.method2();
		ch.method3();
		ch.method4();
						
	}

}
