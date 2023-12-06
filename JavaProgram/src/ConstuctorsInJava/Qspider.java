package ConstuctorsInJava;

public class Qspider {
	void Payment() {
		System.out.println("Payment on online");
	}

	void Payment(int a) {
		System.out.println("Payment On Cash");
	}

	void Payment(int a, String c) {
		System.out.println("Payment on NetBanking");

	}

	public static void main(String[] args) {
		Qspider qspider = new Qspider();
		qspider.Payment();
		qspider.Payment(5);
		qspider.Payment(67, "Rakesh");

	}

}
