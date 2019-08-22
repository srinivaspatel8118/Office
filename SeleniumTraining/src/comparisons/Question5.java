package comparisons;

import java.util.Arrays;

/*
 * 5. Write a program to compare two Object arrays with different types of elements.
i.e., Each Object array should contain 3 elements such as one int, one string and one user defined class object.

 */
public class Question5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] objarr1={11,"Patel",new UserDefinedArray2(111)};
		Object[] objarr2={11,"Patel",new UserDefinedArray2(111)};
		
		System.out.println("-------Object array comparisons-----------");
		System.out.println(Arrays.equals(objarr1,objarr2));//true
		System.out.println(Arrays.deepEquals(objarr1,objarr2));//true
	}

}

class UserDefinedArray2
{
	int a;
	
	
	UserDefinedArray2(int a)
	{
		this.a=a;
	
		
	}
	public boolean equals(Object obj)
	{
		UserDefinedArray2 ref=(UserDefinedArray2)obj;
		return this.a==ref.a;
	}
	
	
	
}