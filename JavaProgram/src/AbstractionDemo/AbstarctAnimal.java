package AbstractionDemo;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog is Barking");
	}
}

class Cat extends Animal {

	void sound() {
		System.out.println("cat is mou!");
	}
}

public class AbstarctAnimal {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.sound();

	}

}
