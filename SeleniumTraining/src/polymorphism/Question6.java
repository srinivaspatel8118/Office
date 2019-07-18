package polymorphism;
/*6.Write programs for the following scenarios:
		a. Create a parent class (ex:Parent1) with one instance method having default modifier, return type String
		b. Create a child class (ex:Child1) by inheriting above Parent class and override the same instance method of 
		above parent class with all possible access modifiers.
		(note: comment previous method if there are more possibilities)
		 */
class Question6 extends Parent2{
	
	/*String instanceMethod()
	{
		String str="patel";
		return str;
	}*/
	/*protected String instanceMethod()
	{
		String str="patel";
		return str;
	}*/
	public String instanceMethod()
	{
		String str="patel";
		return str;
	}
	
	public static void main(String[] args) {
		Question6 q6=new Question6();
		
		System.out.println("the returned value is "+q6.instanceMethod());
	}
}