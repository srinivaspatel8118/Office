package javabasics;

/*
 Write a program to define one instance method by returning instance variable using this keyword and 
print the returned value in console.
 */
public class Question16 {
	
	String str1="Patel";
	
	String returningInstance()
	{
		String str1="Balu";
		return this.str1;
	}

	public static void main(String[] args) {
	
			System.out.println("The returned value from instance method is " +new Question16().returningInstance());//returned value
		
		
	}

}
