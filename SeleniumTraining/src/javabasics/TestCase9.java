package javabasics;
/*
 * 9.Write a program to execute the code from matched case on words to till end.
 */
public class TestCase9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Patel";
		switch(str)
		{
		case "Srinivas": System.out.println("UnMatched");
							
		
		case "Patel": System.out.println("Matched");
					
		case "Vishnu": System.out.println("UnMacthed even though it will execute because no BREAK");
							
		default: System.out.println("default");
							
		}
	}

}
