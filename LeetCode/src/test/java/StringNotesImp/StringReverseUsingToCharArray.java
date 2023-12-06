package StringNotesImp;

public class StringReverseUsingToCharArray {
	public static void main(String[] args) {
		String str = "Java Programming Language";
		char[] Reverse = str.toCharArray();

		for (int i = Reverse.length - 1; i >= 0; i--) {
			System.out.print(Reverse[i]);
		}
		System.out.println("");
	}

}
