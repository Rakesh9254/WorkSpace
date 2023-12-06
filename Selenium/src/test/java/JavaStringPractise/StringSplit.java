package JavaStringPractise;

public class StringSplit {

	public static void main(String[] args) {
		
		String string = "Please email us at mentor@rahulshettyacademy.com with below template to receive response";
		
		String str1 = string.split("at")[1].trim().split(" ")[0];
		
		System.out.println(str1);

	}

}
