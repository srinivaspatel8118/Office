package inhertenceConcept;
/*
 * 8.Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with two instance methods
b. Create a child class (ex:Child1) by inheriting above Parent class and define the same two instance methods of 
above parent class and call the parent & child class methods in main method.
 */
public class Question8 extends Pparent1 {

	void m1()
	{
		System.out.println("m1 method of Child class");
	}
	void m2()
	{
		System.out.println("m2 method of Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question8 q8= new Question8();
		q8.m1();
		q8.m2();
		Pparent1 p1=new Pparent1();
		p1.m1();
		p1.m2();
	}

}
