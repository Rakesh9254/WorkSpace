package QAProgram;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 34, 67, 90, 78, 45 };
		int Search_element = 45;
		for (int i = 0; i < a.length; i++) {
			if (Search_element == a[i])
				break;
			{
				System.out.println("Search Element is Found : " + i);
			}
		}

	}

}
