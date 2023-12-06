package StringNotesImp;

public class RemoveDuplicateStringUsingCharacterArray {
	public static void main(String[] args) {
		String str = "Programming";
		char[] arr = str.toCharArray();
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			Boolean Repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					Repeated = true;
					break;

				}
			}
			if (!Repeated) {
				sBuilder.append(arr[i]);
			}
		}
		System.out.println(sBuilder);
	}

}
