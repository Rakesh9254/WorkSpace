package StringNotesImp;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "  Ja  va   st a  r";
		String Str1 = str.replaceAll("\\s", "");
		System.out.println(Str1);
	}

}
