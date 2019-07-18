package polymorphism;
/*
 * 5.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) with two instance methods
	b. Create a child class (ex:Child1) by inheriting above Parent class and define the same two instance methods of above parent class 
	and call only the child class methods using parent class reference in main method.

 */
public class Question5 extends Parent1 {

	void instanceMethod1()
	{
		System.out.println("Child class Instance Method 1");
	}
	void instanceMethod2()
	{
		System.out.println("Child class Instance Method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent1 p1=new Question5();
		p1.instanceMethod1();
		p1.instanceMethod2();
		
	}

}
