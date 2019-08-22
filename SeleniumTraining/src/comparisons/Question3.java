package comparisons;

import java.util.Arrays;

/*
 * 
3. Write a program to compare user defined arrays having objects with one int & one string parameter.
 */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDefinedArray1 arr1[]= {new UserDefinedArray1(1,"Array1"),new UserDefinedArray1(2,"Array2")};
		UserDefinedArray1 arr2[]= {new UserDefinedArray1(1,"Array1"),new UserDefinedArray1(2,"Array2")};
		System.out.println("---- User defined Comparisons-----");
		System.out.println(Arrays.equals(arr1, arr2));//we must override equals here to compare.
	}

}

class UserDefinedArray1
{
	int a;
	String str;
	
	UserDefinedArray1(int a,String str)
	{
		this.a=a;
		this.str=str;
		
	}
	
	public boolean equals(Object obj){
		//typecast obj to Invoice so that we can compare Invoices 
		UserDefinedArray1 ref=(UserDefinedArray1)obj;
		return this.a==ref.a && this.str.equals(ref.str);
	}
	
}
