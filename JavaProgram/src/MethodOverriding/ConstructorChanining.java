package MethodOverriding;

public class ConstructorChanining {
	ConstructorChanining() {
		System.out.println("Constructor Chanining");
	}

	ConstructorChanining(int x) {
		System.out.println("Constructor Chanining2");
	}

	ConstructorChanining(String nameString) {
		System.out.println("Constructo rChanining 3");
	}

	public static void main(String[] args) {
		ConstructorChanining cdChanining = new ConstructorChanining();

	}

}
