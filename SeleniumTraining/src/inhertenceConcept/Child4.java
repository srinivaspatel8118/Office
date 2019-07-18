package inhertenceConcept;
/*
 * 4.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent4) with two instance variables and one instance & static methods
	b. Create a child class (ex:Child4) by inheriting above Parent class and define other one instance method with return type
 	boolean and then call all the possible members using parent class object in main method
 */
public class Child4 extends Parent4{

	boolean instanceMethod2()
	{
		boolean b=false;
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent4 p4=new Parent4();
		p4.instanceMethod();
		System.out.println("The values from Parent class are "+p4.i+" and "+p4.j);
			
	}

}
