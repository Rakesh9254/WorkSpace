package OOPS;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        
        Dog dog = (Dog) animal; // Downcasting

        animal.makeSound(); // Prints "Woof!"
        dog.makeSound(); // Prints "Woof!"
    }
}
