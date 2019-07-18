package polymorphism;
/*
 * 1.Write a program to define 3 instance methods with same name and different number of arguments and then call all the 3 methods in main method.
 */
public class Question1 {

	void sameMethod(int i)
	{
		System.out.println("Single argument method");
	}
	void sameMethod(int i,String str)
	{
		System.out.println("Double argument method");
	}
	void sameMethod(int i,String str,double d)
	{
		System.out.println("Triple argument method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question1 q1=new Question1();
		q1.sameMethod(10);
		q1.sameMethod(10, "Patel");
		q1.sameMethod(10, "Patel",10.5);
	}

}
