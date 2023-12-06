package Interface;

interface Bank {
	float RateOfInterest();
}

class Sbi implements Bank {
	public float RateOfInterest() {
		return (12.6f);
	}
}

class PNB implements Bank {
	public float RateOfInterest() {
		return (15.7f);
	}
}

public class TestInterface1 {

	public static void main(String[] args) {
		Bank bank = new Sbi();
		System.out.println("Sbi Interest rate of: " + bank.RateOfInterest());

	}

}
