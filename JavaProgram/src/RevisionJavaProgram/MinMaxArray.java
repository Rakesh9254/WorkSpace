package RevisionJavaProgram;

import java.util.Iterator;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 8, 17, 3, 22, 12, 7 };
		int max = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if (numbers[i]>max) {
				max =numbers[i];
			}
		}
		System.out.println("Maximum value in the array: "+max);
	}
}
