package polymorphism;
/*
 * 4.Write a program to define 2 instance methods with same name and one argument of type double & short respectively 
 * and call the method with all possible types of values as parameter.
 */
public class Question4 {

	void sameMethod(double d)
	{
		System.out.println("Double method");
	}
	void sameMethod(short sh)
	{
		System.out.println("short method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 q4=new Question4();
		q4.sameMethod(10.5);//double metho
		q4.sameMethod((short)10);//short method
		q4.sameMethod(10.5f);//double method
		q4.sameMethod(10);//double method
		q4.sameMethod('a');//double method
	}

}
