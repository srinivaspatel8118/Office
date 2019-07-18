package arrays;
/*
 * 1.Write a java program to declare primitive datatype single dimension array , initialized it by passing values and finally print them on console
 */
public class Question1 {
	
	 int a[]=new int[10],i;
	
	 
	void passingDataToArray()
	{
		for(i=0;i<a.length;i++)
		{
			a[i]=i;
		;
			
		}
	}
	
	void printingDataFromArray()
	{
		System.out.println("The array values are");
		for(i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 arr=new Question1();
		arr.passingDataToArray();
		arr.printingDataFromArray();

	}

}
