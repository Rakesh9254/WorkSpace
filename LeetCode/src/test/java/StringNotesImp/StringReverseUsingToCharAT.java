package StringNotesImp;

public class StringReverseUsingToCharAT {
	public static void main(String[] args) {
		String str = "HELLO";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
	}

}
