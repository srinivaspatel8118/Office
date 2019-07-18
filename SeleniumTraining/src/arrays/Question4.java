package arrays;
/*
 * 4.a.Practice above 3 programs with wrapper class data type arrays in place of primitive data type arrays.
 */
public class Question4 {

	Integer  a[]=new Integer[10],i;
	
	 
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
		Question4 arr=new Question4();
		arr.passingDataToArray();
		arr.printingDataFromArray();

	}

}
