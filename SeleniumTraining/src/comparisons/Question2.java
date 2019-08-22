package comparisons;

import java.util.Arrays;

/*
 * 2. Write a program for the following scenarios:
	a. to compare two single dimensional float arrays.
	b. to compare two single dimensional char arrays.
 */
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------For float array---");
		float intarr1[]= {1.5f,2.4f,2.6f,2.7f};
		float intarr2[]= {1.5f,2.4f,2.6f,2.7f};

		System.out.println(Arrays.equals(intarr1, intarr2));// if equals returns true if not false.System.out.println("------For float array---");
		float chararray1[]= {'a','A',65,66};
		float chararray2[]= {'a','A',65,66};

		System.out.println(Arrays.equals(chararray1, chararray2));
	}
}
