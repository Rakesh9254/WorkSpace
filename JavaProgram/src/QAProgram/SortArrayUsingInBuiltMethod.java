package QAProgram;

import java.util.Arrays;

public class SortArrayUsingInBuiltMethod {

	public static void main(String[] args) {
		/*
		 * 
		 * approcha 1 int a[] = { 40, 50, 60, 70, 20, 10, 5, 2 };
		 * System.out.println("Before Sorting Array is :" + Arrays.toString(a));
		 * Arrays.parallelSort(a); System.out.println("After Sorting Array is :" +
		 * Arrays.toString(a));
		 */

		// Approch 2

		int a[] = { 40, 50, 60, 70, 20, 10, 5, 2 };
		System.out.println("Before Sorting Array is :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting Array is :" + Arrays.toString(a));

	}

}
