package inhertenceConcept;
/*
 * 6.b.Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and define other one instance method 
 * with return type int & one static method with return type String
 */
public class Parent222 extends Parent111 {

	int instanceMethod2()
	{
		int i=100;
		return i;
	}
	
	static String staticMethod2()
	{
		String str5="Nagarjuna";
		return str5;
	}
}
