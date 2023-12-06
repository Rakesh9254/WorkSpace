package Interface;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

public class TestInterface2 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		TestInterface2 tc = new TestInterface2();
		tc.print();
		tc.show();
	}

}
