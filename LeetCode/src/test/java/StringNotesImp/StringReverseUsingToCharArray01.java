package StringNotesImp;

public class StringReverseUsingToCharArray01 {
	public static void main(String[] args) {
		String str = "Programming";
		char[] Reversed = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(Reversed[i]);

		}
		System.out.println("");
	}

}
