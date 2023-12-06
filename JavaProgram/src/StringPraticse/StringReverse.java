package StringPraticse;

public class StringReverse {
	public static void main(String[] args) {
		String str = "I am Rakesh";
		String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
		
	}

}
