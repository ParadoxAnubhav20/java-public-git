interface SampleInterface {
    default void display() {  // No need for 'public' in a default method
        System.out.println("Default Method");
    }
    void sampleMethod();  // No need for 'public' (implicitly public)
}

public class InterfaceDemo implements SampleInterface {
    @Override
    public void sampleMethod() {
        System.out.println("Overridden Method");
    }

    public static void main(String[] args) {
        SampleInterface s = new InterfaceDemo();
        s.display();  // Calls default method
        s.sampleMethod();  // Calls overridden method

        // Corrected anonymous class implementation
        SampleInterface x = new SampleInterface() {
            @Override
            public void sampleMethod() {
                System.out.println("Anonymous Class Implementation");
            }
        };

        x.display();
        x.sampleMethod();
    }
}
