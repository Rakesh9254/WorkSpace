package Oct2023;

import java.util.Scanner;

public class PerfectSquareChecker1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		double number = scanner.nextInt();
		double sqrt = Math.sqrt(number);
		System.out.println("Square Root: " + sqrt);
		double sqrtf = Math.floor(sqrt);
		System.out.println("Floor Values: " + sqrt);
		if (sqrt - sqrtf != 0) {
			System.out.println(number+" Not Perfect square");
		} else {
			System.out.println(number+" Perfect square");
		}

	}

}
