package AbstractionDemo;

abstract class BankOfInterest {
	abstract int getRateOfInterest();
}
class Sbi extends BankOfInterest{
	int getRateOfInterest(){return 7;} 
}
class PNB extends BankOfInterest {
	int getRateOfInterest(){return 8;}    
}


public class Bank {

	public static void main(String[] args) {
		BankOfInterest bc = new Sbi();
		bc.getRateOfInterest();
		

	}

}
