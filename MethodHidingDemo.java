class ParentClass {
    public static void display() {
        System.out.println("Method Inside Parent Class");
    }
}

class ChildClass extends ParentClass {
    public static void display() {
        System.out.println("Method Inside Child Class");
    }
}

public class MethodHidingDemo {
    public static void main(String[] args) {
        ParentClass p = new ChildClass();
        p.display();
        ChildClass c = new ChildClass();
        c.display();
    }
}
