package polymorphism;
/*
 * 7.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) with one instance method having int var-args.
	b. Create a child class (ex:Child1) by inheriting above Parent class and overload the same instance method of above parent class
	 with single int parameter and then call the method with all possible reference types.
 */
public class Child1 extends Parent3 {

	void instanceMethod(int i)
	{
		System.out.println("child one class method");
	}
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.instanceMethod(10);
		
		Parent3 p3=new Parent3();
		p3.instanceMethod(10);
		
		Parent3 p4=new Child1();
		p4.instanceMethod(10);
		
		
	}
}
