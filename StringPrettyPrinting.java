public class StringPrettyPrinting {
    public static void main(String[] args) {
        // Creating two String objects with the same value
        float val = 123.45789f;
        
        // Print float value with 3 decimal places
        System.out.printf("\nFormatted Value: %.3f", val); 
        
        // Print a formatted string with placeholders for name and favorite game
        System.out.printf("\nMy name is %s and I like %s.", "Anu", "Titanfall"); 
        
        // Print a formatted string with a placeholder for favorite character
        System.out.printf("\nFavorite Character: %c", 'F'); 
        
        // Adding more examples
        
        // Declaring variables for a person's information
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;
        char gender = 'M';
        
        // Print person's name, age, and gender
        System.out.printf("\n\nName: %s %s\nAge: %d\nGender: %c", firstName, lastName, age, gender); 
    }
}
