package polymorphism;
/*
 * 10.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) and define one instance method
	b. Create a child class (ex:Child1) by inheriting above Parent class and override the same method 
	and define other instance method and call the overriding & overridden methods inside this method and 
	then invoke this new instance method in main method.
	 */
public class Question10 extends Parent6 {

	void instanceMethod()
	{
		System.out.println("Child class Method");
	}
	void instanceMedthod2()
	{
		this.instanceMethod();
		super.instanceMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Question10().instanceMedthod2();
	}

}

class Parent6
{
	void instanceMethod()
	{
		System.out.println("Parent class Method");
	}
}