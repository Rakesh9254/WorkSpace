package ArrayDemo;

public class Array2 {
	public static void main(String[] args) {
		
		int marks[] = { 4, 7, 5, 9, 10 };
		System.out.println("Marks Of Lenght:" +marks.length);
//		for (int i = 0; i < marks.length; i++) {
//			
//			System.out.println(marks[i]);
//			
//		}
		
		for(int i : marks) {
			System.out.println(i);
		}
		
	}

}
