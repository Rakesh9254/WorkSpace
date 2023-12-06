package StringNotesImp;

public class StringReverseUsingStringBuilder {
	public static void main(String[] args) {
		String str = "Hello";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

}
