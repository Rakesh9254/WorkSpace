package RevisionJavaProgram;

import java.util.Scanner;

public class Fcatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number is: ");
		int number = scanner.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Fcatorial Of " + number + " is: " + fact);

	}

}
