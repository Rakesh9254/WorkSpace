package RevisionJavaProgram;

import java.util.Scanner;

public class palindrome12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        int Org_Number = number;
        int rev = 0;

        while (number != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        
        if (Org_Number == rev) { // Compare Org_Number with the reversed number
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is Not Palindrome");
        }
    }
}
