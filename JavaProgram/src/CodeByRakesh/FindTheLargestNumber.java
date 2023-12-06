package CodeByRakesh;

import java.util.Scanner;

public class FindTheLargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number:-");
		int a = scanner.nextInt();
		System.out.println("Enter the Second Number:-");
		int b = scanner.nextInt();
		System.out.println("Enter the Third Number:-");
		int c = scanner.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " is Largest Number.");
		} else if (b > a && b > c) {
			System.out.println(b + " is Largest Number.");
		} else {
			System.out.println(c + " is Largest Number.");
		}

	}

}
