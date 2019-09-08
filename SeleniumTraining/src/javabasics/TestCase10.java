package javabasics;

/*
 * 10.Add any 5 integer values to the array and print those values using for each and for loop as well.
 */
public class TestCase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={10,20,30,40,50};
		
	
		
		
		for(int temp:a)
		{
			System.out.println(temp);
		}
		
		System.out.println("");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		/*ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(10);
	      arrlist.add(20);
	      arrlist.add(30);
	      arrlist.add(40);
	      arrlist.add(50);
		
		for(int temp:arrlist)
		{
			System.out.println(temp);
		}
		 
		for(int i=0;i<arrlist.size();i++)
		{
			System.out.println(arrlist.get(i));
			
		}*/
	}

}
