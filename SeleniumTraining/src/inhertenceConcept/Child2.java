package inhertenceConcept;
/*
 * 2.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent2) with two instance variables and two instance methods
	b. Create a child class (ex:Child2) by inheriting above Parent class and define other two instance methods
	 and then call all the parent and child class members in main method
 */
public class Child2 extends Parent2 {

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

		Child2 ch=new Child2();
		ch.method1();
		ch.method2();
		ch.method3();
		ch.method4();
		System.out.println("The I and J values from parent class are "+ch.i+" and "+ch.j);
		
	}

}
