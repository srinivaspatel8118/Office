package arrays;
/*
 * 8.Program to Print  middle row data from double dimension array.
 */
public class Question8 {
	int []arr[]= new int[5][4];
	
	int number=11;
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
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println("\n");
			}
			
		}
		
			
		
		void printingMiddlerowArray()
		{
			int rownumber=arr.length;
			if(( rownumber%2)!=0 )
			{
			     int middlerownumber = (rownumber-1)/2;
			         System.out.println("Mid Row is");
			         for(int j=0; j<arr[middlerownumber].length; j++)
			         {
			             System.out.print(arr[middlerownumber][j]+ "  ");
			         }
			   }
			else 
			{
				System.out.println("Please take row size an odd number");
			}

			}
			



	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		Question8 q8=new Question8();
		q8.assigningValues();
		q8.printingDoubleArray();
		q8.printingMiddlerowArray();
	}

}
