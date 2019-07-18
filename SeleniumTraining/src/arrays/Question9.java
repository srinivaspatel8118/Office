package arrays;

public class Question9 {
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
		
			
		
		void printingSecondColumnrowArray()
		{
			int Columnnumber=1;
			
			

			int rownumber=arr.length;
			if(( rownumber%2)!=0 )
				{
				     int middlerownumber = (rownumber-1)/2;
				         System.out.println("Mid Row second column is");
				         System.out.print(arr[middlerownumber][Columnnumber]);   
				}
			else 
				{
					System.out.println("Please take row size an odd number");
				}
			
			
			
		}
			



	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		Question9 q9=new Question9();
		q9.assigningValues();
		q9.printingDoubleArray();
		q9.printingSecondColumnrowArray();
	}

}
