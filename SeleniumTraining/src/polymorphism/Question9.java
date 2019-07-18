package polymorphism;
/*
 * 9.Write programs for the following scenarios:
	a. Create a parent class (ex:Parent1) and declare two instance variables of type String with values assigned
	b. Create a child class (ex:Child1) by inheriting above Parent class and declare same two instance variables of type String with
	  different values assigned and define one instance method with two String parameters and print the values of all variables such as local,
	  instance & parent class variables inside this instance method, finally call the instance method in main method.
	   (note: all the variable names should be same).

 */
public class Question9 extends Parent5 {

	String str="Ravi";
	String str1="Kumar";
	void instanceMethod(String str,String str1)
	{
		System.out.println("the values which are passed duering call are "+str+" and "+str1);
		System.out.println("the instnace string of current classs is "+this.str+" and "+this.str1);
		System.out.println("the instance string of Parent classs is "+super.str+" and "+super.str1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Question9().instanceMethod("Nagarjuna", "Reddy");
	}

}

class Parent5{
	String str="Srinivas";
	String str1="Patel";
	
}
