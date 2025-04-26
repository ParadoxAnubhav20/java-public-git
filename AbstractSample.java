abstract class Parent {
    public abstract void display();
    public abstract void anotherMethod();
    
    public void concreteMethod() {
        System.out.println("Concrete Method in Parent Class");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child Class Method");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Another Method in Child Class");
    }
    
    public void childSpecificMethod() {
        System.out.println("Child Specific Method");
    }
}

public class AbstractSample {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();  // Output: Child Class Method
        p.anotherMethod();  // Output: Another Method in Child Class
        p.concreteMethod();  // Output: Concrete Method in Parent Class
        
        Child c = new Child();
        c.display();  // Output: Child Class Method
        c.anotherMethod();  // Output: Another Method in Child Class
        c.concreteMethod();  // Output: Concrete Method in Parent Class
        c.childSpecificMethod();  // Output: Child Specific Method
    }
}
