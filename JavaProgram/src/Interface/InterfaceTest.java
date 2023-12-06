package Interface;

interface Printable {
	void print();
}

public class InterfaceTest implements Printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		InterfaceTest tcInterfaceTest = new InterfaceTest();
		tcInterfaceTest.print();

	}

}
