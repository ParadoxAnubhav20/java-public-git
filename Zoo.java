// Base class representing an Animal
class Animal {
    // Method to make a sound, default implementation for an unknown animal
    public void makeSound() {
        System.out.println("Unknown Animal Sound");
    }
}

// Dog class inheriting from Animal
class Dog extends Animal {
    
    // Overriding the makeSound method to provide a specific sound for a dog
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println("Fetching");
    }
}

// Cat class inheriting from Animal
class Cat extends Animal {

    // Overriding the makeSound method to provide a specific sound for a cat
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    // Additional method specific to Cat
    public void scratch() {
        System.out.println("Cat Scratches");
    }
}

// Main class to demonstrate the functionality of the Animal hierarchy
public class Zoo {
    public static void main(String[] args) {
        // Create an instance of Animal and call makeSound (will print "Unknown Animal Sound")
        Animal a = new Animal();
        a.makeSound();

        // Polymorphism: Assign a Dog object to an Animal reference and call makeSound (will print "Woof")
        a = new Dog();
        a.makeSound();

        // Create a Dog object and call its methods (will print "Woof" and "Fetching")
        Dog d = new Dog();
        d.makeSound();
        d.fetch();

        // Polymorphism: Assign a Cat object to an Animal reference and call makeSound (will print "Meow")
        Animal c = new Cat();
        c.makeSound();

        // Downcasting the Animal reference to a Cat reference to access Cat-specific methods
        Cat c1 = (Cat) c;
        c1.makeSound();  // Will print "Meow" again
        c1.scratch();    // Will print "Cat Scratches"

        System.out.println(c1 instanceof Cat);
        System.out.println(c1 instanceof Animal);
    }    
}
