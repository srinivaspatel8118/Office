package polymorphism;
/*
 * 7.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) with one instance method having int var-args.
	b. Create a child class (ex:Child1) by inheriting above Parent class and overload the same instance method of above parent class
		with single int parameter and then call the method with all possible reference types.
	c. Create a child class (ex:Child2) by inheriting above Parent class and override the same instance method of 
		above parent class and then call the method with all possible reference types.

 */
public class Question7 extends Child1 {

	void instanceMethod(int i)
	{
		System.out.println("child two class method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question7 q7=new Question7();
		q7.instanceMethod(10);//child two class
		
		Child1 q8=new Question7();
		q8.instanceMethod(10);//child two class
		
		Child1 c1=new Child1();
		c1.instanceMethod(10);//child one class
		
		Parent3 p3=new Parent3();
		p3.instanceMethod(10);//parent var-args
		
		Parent3 p4=new Child1();
		p4.instanceMethod(10);//parent var-args

	}

}
