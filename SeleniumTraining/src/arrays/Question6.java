package arrays;
/*
 * 6.Program declare double dimension array and initialize by passing values directly.
 */
public class Question6 {

	int []arr[]={{1,2,3},{4,5,6},{7,8,9}};
	
	void printingDoubleArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question6 q6=new Question6();
		q6.printingDoubleArray();
	}

}
