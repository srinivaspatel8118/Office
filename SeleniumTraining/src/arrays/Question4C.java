package arrays;

public class Question4C {

	
	
	Character a[]={65,97,'a','b','c','D'};
	Integer i;
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

		Question4C arr=new Question4C();
		arr.printingDataFromDeclaredArray();
	}

}
