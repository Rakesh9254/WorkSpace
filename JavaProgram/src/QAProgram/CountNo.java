package QAProgram;

import java.util.Scanner;

public class CountNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number.");
		int number = scanner.nextInt();

		int Count = 0;
		while (number > 0) {
			number = number / 10;
			Count++;
		}
		System.out.println("Total Digits Of Number :- " + Count);

	}

}
