package arrays;
/*
 * 3.Write a java program by following the same steps in the second program and additionally add piece of code to  assign your own values to array and print them on console
 */
public class Question3 {

	int a[]={100,20,30,40,99,199},i;
	void printingDataFromDeclaredArray()
	{
		System.out.println("The declared array values are");
		for(i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question3 arr=new Question3();
		arr.printingDataFromDeclaredArray();
	}

}
