package RevisionJavaProgram;

import java.util.Scanner;

public class ArmstrongNumberCheckerSimple {
	public static boolean IsArmstrongNumber(int number) {
		int sum = 0;
		for (int temp = number; temp > 0; temp /= 10) {
			int digit = temp % 10;
			sum += Math.pow(digit, 3);
		}
		return sum == number;
	}

	public static void main(String[] args) {
		int Number = 153;
		boolean IsArmstrongNumber = IsArmstrongNumber(Number);
		if (IsArmstrongNumber) {
			System.out.println("+ve");
		} else {
			System.out.println("-Ve");
		}
	}
}
