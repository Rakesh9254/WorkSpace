package QAProgram;

public class Swapping2Number {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int t;
		System.out.println("Before Swapping the Number is .." + a + "  " + b);
		/*
		 * logic first using 3RD Variables
		 * 
		 * t = a; a = b; t = b;
		 * 
		 * logic 2 using + & - without using 3rd variables a= a+b; b= a-b; a = a-b;
		 */

		// logic 3 using * & % without using 3rd variables
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping the Number is .." + a + "  " + b);

	}

}
