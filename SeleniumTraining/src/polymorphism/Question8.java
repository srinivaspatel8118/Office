package polymorphism;
/*
 * 8.Write programs to inherit the parent class and override the instance method by using covariant return type 
 * and then call the method with all the 3 possible reference types.
 
 */
public class Question8 extends Parent4  {
	
	String method1()
	{
		return "Patel";
	}
	public static void main(String[] args) {
		Question8 q8=new Question8();
		System.out.println("The returned value is "+q8.method1());
		
		Parent4 p4=new Parent4();
		System.out.println("The returned value is "+p4.method1());//returns object only
		
		Parent4 p5=new Question8();
		System.out.println("The returned value is "+p5.method1());
	}
	
}


class Parent4{
	Object   method1(){
		return new Parent4();
	}
}

