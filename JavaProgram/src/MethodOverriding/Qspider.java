package MethodOverriding;

public class Qspider {
	void payment() {
		System.out.println("Cash Payment");
	}
	
	void payment(int a) {
		System.out.println("Online Payment");
	}

	public static void main(String[] args) {
		Qspider qspider = new Qspider();
		qspider.payment();
		qspider.payment(35);

	}

}
