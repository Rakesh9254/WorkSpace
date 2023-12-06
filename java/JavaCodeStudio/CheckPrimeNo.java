package JavaCodeStudio;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number == 2) {
			System.out.println(number + " is prime Number.");
		}
		boolean isPrime = true;
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(number + " is a Prime Number.");
		} else {
			System.out.println(number+ " is a Not Prime Number.");
		}

	}

}
