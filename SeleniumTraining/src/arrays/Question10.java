package arrays;
/*
 * 10. Program to create an instance method with return type is  any “primitive data type double dimension array” and call it from main method and print values on console.
 */
public class Question10 {

	int[][] doubleArray()
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question10 q10= new Question10();
		int a[][]=q10.doubleArray();
			
				for(int i=0;i<q10.doubleArray().length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					
					System.out.println("\n");
				}
				
				
		
	}

}
