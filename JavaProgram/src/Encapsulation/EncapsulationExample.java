package Encapsulation;

public class Person {
    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        if (Age >= 0 && Age <= 75) {
            this.Age = Age;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 75");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person(); // Corrected the class name
        person.setName("Rakesh");
        person.setAge(45);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
