package inhertenceConcept;
/*
 * 7.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) with two instance methods with return type String
	b. Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and define other two instance method with
	 return type int & one static method with return type String
	c. Create a child class (ex:Child1) by inheriting above Parent class(Parent2) and define other two instance variables
	 & two instance methods and then call only the above two parent class members using parent2 class object in main method.
 */
public class Question7 extends Parent2222 {

	int a=20,b=40;
	void instnaceMetod5()
	{
		System.out.println("Child class intance method5");
	}
	void instnaceMetod6()
	{
		System.out.println("Child class intance method6");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent2222 p2=new Parent2222();
		System.out.println("The returned String from instance method1 of Parent1111 is "+p2.instnaceMethod1());
		System.out.println("The returned String from instance method2 of Parent1111 is "+p2.instnaceMethod2());
		System.out.println("The returned value from instance method3 of Parent2222 is "+p2.instnaceMethod3());
		System.out.println("The returned value from instance method4 of Parent2222 is "+p2.instnaceMethod4());
		System.out.println("The returned String from Static method1 of Parent2222 is "+Parent2222.staticMethod1());
	}

}
