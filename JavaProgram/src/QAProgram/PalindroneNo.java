package QAProgram;

import java.util.Scanner;

public class PalindroneNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = scanner.nextInt();

		int Org_Number = number;
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		if (Org_Number == rev) {
			System.out.println(rev + " :is Palindrone Number.");
		} else {
			System.out.println(rev + " :is Not Palindrone Number.");
		}

	}

}
