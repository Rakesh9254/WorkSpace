package InterviewQuestion;

public class CharacterCount {
	public static void main(String[] args) {
		String name = "Welcome";
		char[] targetChars = { 'e', 'a', 'i', 'o', 'u' }; // Array of characters to count

		int count = 0; // Initialize a count variable to 0

		// Loop through each character in the string
		for (int i = 0; i < name.length(); i++) {
			char currentChar = name.charAt(i);
			// Check if the current character is one of the target characters
			for (char targetChar : targetChars) {
				if (currentChar == targetChar) {
					count++; // Increment the count if a match is found
				}
			}
		}

		System.out.println(
				"The characters 'e', 'a', 'i', 'o', and 'u' appear a total of " + count + " times in the string.");
	}
}
