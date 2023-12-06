package SeleniumInterviewQuestion;

public class StringSplit {

	public static void main(String[] args) {
		String S1 = "Java,Selenium,TestNG,Maven";
		String[] strArray = S1.split(",");

		for (String str : strArray) {
			System.out.println(str);
		}

	}

}