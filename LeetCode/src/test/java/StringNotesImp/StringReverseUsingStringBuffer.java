package StringNotesImp;

public class StringReverseUsingStringBuffer {
	public static void main(String[] args) {
		String str = "Hello Java";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
