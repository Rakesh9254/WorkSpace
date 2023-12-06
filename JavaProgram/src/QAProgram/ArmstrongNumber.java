package QAProgram;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();

		if (isArmstrongNumber(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}

	// Function to check if a number is an Armstrong number
	public static boolean isArmstrongNumber(int num) {
		int originalNumber, remainder, result = 0;
		originalNumber = num;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		return result == num;
	}
}
