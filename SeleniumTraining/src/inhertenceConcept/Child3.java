package inhertenceConcept;
/*
 * 3.Write programs for the following scenarios:
	a.Create a parent class (ex:Parent3) with two static variables and one instance & static methods
	b.Create a child class (ex:Child3) by inheriting above Parent class and define other two instance methods with return type String
 		and then call all the parent and child class members in main method
 */
public class Child3 extends Parent3{

	String instanceMethod2()
	{
		String str1="Srinivas";
				return str1;
	}
	String instanceMethod3() 
	{
		String str2="Patel";
		return str2;
	}
	
	public static void main(String[] args) {
		Child3 ch=new Child3();
		ch.instanceMethod();
		//ch.staticMethod();
		Parent3.staticMethod();
		System.out.println("The values of static variable from parent class are "+Parent3.i+" and"+Parent3.j);
		System.out.println("The returened string from child instance method2 is "+ch.instanceMethod2());
		System.out.println("The returened string from child instance method3 is "+ch.instanceMethod3());
		
	}
	
}
