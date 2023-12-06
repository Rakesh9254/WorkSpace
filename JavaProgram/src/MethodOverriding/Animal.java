package MethodOverriding;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class Animal extends Vehicle {
	void run() {
		System.out.println("Bike is running safely");
	}

    public static void main(String[] args) {

        Vehicle animal = new Vehicle(); // Create an instance of Animal
        animal.run();

    }
}
