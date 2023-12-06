package QAProgram;

public class ReverseString {

	public static void main(String[] args) {

		// Using + (String Concatenation) Method

		String str = "ABCD";
		String rev = ""; // Initialize rev as an empty string
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}
