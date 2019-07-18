package inhertenceConcept;
/*
 * 6.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) with one instance & one static variable of type String and one instance & one static method with return type String
	b. Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and define other one instance method
	 with return type int & one static method with return type String
	c. Create a child class (ex:Child1) by inheriting above Parent class(Parent2) and define other two instance variables 
	& two static methods and then call all the parent & child class members in main method.
 */
public class Question6 extends Parent222 {

	int a=100,b=200;
	static void instanceMethod3()
			{
			System.out.println("Child class instance Method3");
			}
	static void instanceMethod4()
			{
			System.out.println("Child class instance Method4");
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question6 q6=new Question6();
		System.out.println("The returned value from parent111 instance method is "+q6.instnaceMethod1());
		System.out.println("The returned value from parent111 static method is "+Parent111.staticMethod1());
		System.out.println("The instance and Static strings from the Parent111 are "+q6.str1+" and"+Parent111.str2);
		System.out.println("The returned value from parent222 instance method2 is "+q6.instanceMethod2());
		System.out.println("The returned value from parent222 static method2 is "+Parent222.staticMethod2());
		Question6.instanceMethod3();
		Question6.instanceMethod4();
		System.out.println("The values of A and B from child class are "+q6.a+" and"+q6.b);
	}

}
