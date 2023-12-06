package QAProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int number = scanner.nextInt();

		// first Logic
		/*
		 * int rev = 0; while(number!=0) { rev = rev *10 +number%10; number = number/10;
		 */

		// Second Logic StringBuffer Class
		/*
		 * StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
		 * StringBuffer rev = stringBuffer.reverse();
		 * 
		 * System.out.println(rev);
		 */

		// StringBuilder Method
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(number);
		StringBuilder rev = stringBuilder.reverse();

		System.out.println(rev);

	}

}
