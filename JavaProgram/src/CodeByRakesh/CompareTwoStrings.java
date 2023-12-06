package CodeByRakesh;

import java.util.Scanner;

public class CompareTwoStrings {
	public static void compare(String Firstname, String LastName) {
		if (Firstname.compareTo(LastName) == 0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String");
		String Firstname = scanner.next();
		System.out.println("Enter the Second String");
		String LastName = scanner.next();
		compare(Firstname, LastName);

	}

}
