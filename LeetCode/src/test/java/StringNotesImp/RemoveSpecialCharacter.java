package StringNotesImp;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String str = "$ja!va$&st%ar";
		String special = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(special);
	}

}
