package Oct2023;

import java.util.Scanner;

public class PerfectSquareChecker {

	public static boolean isPerfectSquare(double number) {
		if (number < 0) {
			return false; // Negative numbers are not perfect squares
		}

		int sqrt = (int) Math.sqrt(number);
		return sqrt * sqrt == number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		double number = scanner.nextInt();

		boolean isPerfectSquare = isPerfectSquare(number);

		if (isPerfectSquare) {
			System.out.println(number + " is a perfect square.");
		} else {
			System.out.println(number + " is not a perfect square.");
		}

	}

}