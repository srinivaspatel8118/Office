package arrays;
/*
 * 2.Write a java program to declare single dimension array, initialized it with some array size and print the default values on console.
 */
public class Question2 {

	int a[]=new int[10],i;
	void printingDataFromDefaultArray()
	{
		System.out.println("The default array values are");
		for(i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		Question2 arr=new Question2();
		arr.printingDataFromDefaultArray();
	}
}
