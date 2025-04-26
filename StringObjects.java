public class StringObjects {
    public static void main(String[] args) {
        // Creating two String objects with the same value
        String name = new String("Anubhav");
        System.out.println("Name: " + name);

        String title = new String("Anubhav");

        // Comparing the references of the two String objects
        // This will check if the references are pointing to the same object in memory
        System.out.println("Comparison using '==': " + (name == title)); // Corrected variable name to "name"

        // Comparing the contents of the two String objects
        // This will check if the contents of the two objects are the same
        System.out.println("Comparison using 'equals': " + name.equals(title)); // Corrected variable name to "name"

        // Printing the name again
        System.out.print("Name: " + name);
    }
}
