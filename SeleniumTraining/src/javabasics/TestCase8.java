package javabasics;
/*
 * 8.Write a program to execute the matched case.
 */
public class TestCase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=65;
		String str="UnMatched";
		char s='A';
		switch(i)
		{
		case 'A': System.out.println("UnMatched");
							break;
		
		case 'B': System.out.println("Matched");
							break;
		default: System.out.println("default");
							
		}
		
	}

}
