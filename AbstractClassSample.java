// Abstract class Shape that represents a general shape
abstract class Shape {
    // Protected member variable to hold a dimension of the shape
    protected int side;

    // Constructor to initialize the side/dimension of the shape
    public Shape(int side) {
        this.side = side;
    }

    // Abstract method to draw the shape, to be implemented by subclasses
    public abstract void draw();

    // Abstract method to calculate the area of the shape, to be implemented by subclasses
    public abstract double area();
}

// Circle class extending Shape, representing a circle
class Circle extends Shape {
    // Constructor to initialize the radius of the circle
    public Circle(int r) {
        super(r);
    }

    // Overridden method to draw a circle
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    // Overridden method to calculate the area of the circle
    @Override
    public double area() {
        return 3.14 * side * side; // Using side as radius
    }
}

// Square class extending Shape, representing a square
class Square extends Shape {
    // Constructor to initialize the side length of the square
    public Square(int s) {
        super(s);
    }

    // Overridden method to draw a square
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    // Overridden method to calculate the area of the square
    @Override
    public double area() {
        return side * side; // Area of a square is side squared
    }
}

// Main class to demonstrate the use of abstract class and its subclasses
public class AbstractClassSample {
    public static void main(String[] args) {
        // Create a Circle object with radius 7
        Shape s = new Circle(7);
        // Print the area of the circle
        System.out.println("Area of Circle: " + s.area());

        // Create a Square object with side length 9
        s = new Square(9);
        // Print the area of the square
        System.out.println("Area of Square: " + s.area());
    }
}
