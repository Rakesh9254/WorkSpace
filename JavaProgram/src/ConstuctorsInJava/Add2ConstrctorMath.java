package ConstuctorsInJava;

public class Add2ConstrctorMath {
	void Add(int a, int b) {
		int z = a + b;
		System.out.println(z);
	}

	void Add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}

	public static void main(String[] args) {
		Add2ConstrctorMath sc = new Add2ConstrctorMath();

		sc.Add(13, 45, 2);

	}

}
