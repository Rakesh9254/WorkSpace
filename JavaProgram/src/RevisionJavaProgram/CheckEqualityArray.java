package RevisionJavaProgram;

import java.util.Arrays;

public class CheckEqualityArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int b[] = { 1, 2, 3, 4, 5, 6, 16, 8 };

		Boolean statusBoolean = Arrays.equals(a, b);
		if (statusBoolean == true) {
			System.out.println("Array is Equal");
		} else {
			System.out.println("Array is not Equal");
		}

	}

}
