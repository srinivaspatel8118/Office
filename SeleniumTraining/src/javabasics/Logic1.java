package javabasics;

public class Logic1 {

	public static void main(String[] args) {

		
		int i,j=0,n=5;
		for(i=1;i<=n;i++)
		 {
			System.out.println();
			if(i%2==0)
			{
				for(j=0;j<i;j++)
				{
					System.out.print(i);
					System.out.print(n+i);
					
				}
				System.out.println();
			}
			else
			{
				for(j=0;j<i;j++)
				{
					System.out.print(i);
					System.out.print(n-i);
		
				}
				System.out.println();
		
			}
		 }
	}

}
