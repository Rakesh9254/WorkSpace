package QAProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = scanner.next();

		String orgString = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) { // Change i++ to i--
			rev = rev + str.charAt(i);
		}
		if (rev.equals(orgString)) {
			System.out.println(orgString + " is Palindrome.");
		} else {
			System.out.println(orgString + " is Not Palindrome.");
		}
	}
}
