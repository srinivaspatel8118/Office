package arrays;
/*
 * 7.Program to declare double dimension array and assign the values dynamically
 */
public class Question7 {

	int []arr[]= new int[3][3];
		
	int number=0;
		void assigningValues()
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					arr[i][j]=number;
					number++;
				}
			}
		}
	
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

		Question7 q7=new Question7();
		q7.assigningValues();
		q7.printingDoubleArray();
		
		
	}

}
