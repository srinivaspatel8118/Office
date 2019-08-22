package comparisons;

/*
 * 1. Write a program to compare two single dimensional arrays of Strings.
 */
import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1[]= {"Srinivas","Patel","Balu","Raju"};
		String str2[]= {"Srinivas","Patel","Balu","Raju"};
		String str3[]= {"Srinivas","Patel","Raju","Balu"};
		
		System.out.println(Arrays.equals(str1, str2));// if equals returns true if not false.
		System.out.println(Arrays.equals(str1, str3));
	}

}
