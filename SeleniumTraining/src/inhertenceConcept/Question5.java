package inhertenceConcept;
/*
 * 5.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) with one instance & one static variable and one instance & one static method
	b. Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and define other one instance method with 
	return type boolean & one static method
	c. Create a child class (ex:Child1) by inheriting above Parent class(Parent2) and define other two instance methods and 
	then call all the parent & child class members in main method.

 */
public class Question5 extends Parent22 {

	void instanceMethod3()
	{
		System.out.println("Child class instance method3");
	}
	void instanceMethod4()
	{
		System.out.println("Child class instance method4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question5 q5=new Question5();
		q5.instanceMethod1();
		Parent11.staticMethod1();
		System.out.println("The boolean value from instance method2 of parent22 clas is "+q5.instanceMethod2());
		Parent22.staticMethod2();
		q5.instanceMethod3();
		q5.instanceMethod4();
		System.out.println("The instance and Static values from the Parent11 are "+q5.i+" and"+Parent11.j);
	}

}
