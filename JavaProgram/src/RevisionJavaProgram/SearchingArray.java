package RevisionJavaProgram;

public class SearchingArray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 50, 70 };
		int Search_Element = 50;

		for (int i = 0; i < arr.length; i++) {
			if (Search_Element == arr[i]) {
				System.out.println("Search Element is Found : "+ arr[i]);
				break;
			}
		}
	}

}
