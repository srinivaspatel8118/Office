package javabasics;
/*
 * 8.Write a program to execute the matched case.
 */
public class TestCase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Patel";
		switch(str)
		{
		case "Srinivas": System.out.println("UnMatched");
							break;
		
		case "Patel": System.out.println("Matched");
							break;
		default: System.out.println("default");
							
		}
		
	}

}
