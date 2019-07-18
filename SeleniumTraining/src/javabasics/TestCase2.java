package javabasics;
/*
 * 2.Declare and initialize three integers values a, b, c and print a statement when ‘b’ greater than ‘a’ 
 * and print some other statement when ‘a’ greater than ‘c’ 
 * and if both conditions are not matched then print some other statement.
 */
public class TestCase2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10,c=15;
	/*if(b>a)
	{
		System.out.println("B is greater than A");
	}
	else if(a>c)
	{
		System.out.println("A is greater than C");
	}
	else
	{
		System.out.println("C is greater");
	}*/
		if(b>a)
		{
			System.out.println("B is greater than A");
			if(a>c)
			{
				System.out.println("A is greater than C");
			}
		}
		else
		{
			System.out.println("C is greater");
		}
}

}
