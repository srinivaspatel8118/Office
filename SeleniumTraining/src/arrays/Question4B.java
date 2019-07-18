package arrays;

public class Question4B {
	Byte  a[]=new Byte[10];
	Integer i;
	void printingDataFromDefaultArray()
	{
		System.out.println("The default array values are");
		for(i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		Question4B arr=new Question4B();
		arr.printingDataFromDefaultArray();
	}
}
