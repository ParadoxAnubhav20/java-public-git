// Parent class Animal
class Animal {
    // Method to describe the place where animals live
    void place() {
        System.out.println("Animals live on earth.");
    }
}

// Dog class extends Animal class
class Dog extends Animal {
    // Override method to describe where dogs live
    @Override
    void place() {
        System.out.println("Dog lives in a kennel.");
    }
}

// Horse class extends Animal class
class Horse extends Animal {
    // Override method to describe where horses live
    @Override
    void place() {
        System.out.println("Horse lives in a stable.");
    }
}

// Rabbit class extends Animal class
class Rabbit extends Animal {
    // Override method to describe where rabbits live
    @Override
    void place() {
        System.out.println("Rabbit lives in a burrow.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating object of Animal class
        Animal A = new Animal();
        A.place(); // Output: Animals live on earth.

        // Polymorphism demonstrated: Assigning different objects to the same reference variable
        A = new Dog();
        A.place(); // Output: Dog lives in a kennel.

        A = new Horse();
        A.place(); // Output: Horse lives in a stable.

        A = new Rabbit();
        A.place(); // Output: Rabbit lives in a burrow.
    }
}
