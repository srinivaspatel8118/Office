package comparisons;

import java.util.Arrays;

/*
 * 4. Write a program to compare two dimensional String arrays.
 */
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("-----two dimensional array comparisons------");
		System.out.println(Arrays.deepEquals(arr1,arr2));//Must use deepEquals for multi dimensional array
	}

}
