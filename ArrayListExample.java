import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("Welcome to ArrayListExample!");

        // Creating an ArrayList of integers
        ArrayList<Integer> integerList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        integerList.add(4);
        integerList.add(2);
        integerList.add(0);
        integerList.add(0, 69); // Inserting 69 at index 0
        System.out.println("ArrayList after adding elements: " + integerList);

        // Getting and printing an element at index 2
        System.out.println("Element at index 2: " + getElementAtIndex(integerList, 2));

        // Printing all elements of the ArrayList using a for loop
        System.out.print("Elements of the ArrayList: ");
        printArrayList(integerList);
        
        // Checking if the ArrayList contains a specific element
        boolean containsElement = containsElement(integerList, 4);
        System.out.println("Does the ArrayList contain 4? " + containsElement);

        // Creating a new ArrayList with different data types
        ArrayList<Object> mixedList = createMixedList();
        System.out.println("Mixed ArrayList: " + mixedList);
    }

    // Method to get an element at a specified index
    public static Integer getElementAtIndex(ArrayList<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            System.out.println("Invalid index!");
            return null;
        }
    }

    // Method to print all elements of an ArrayList
    public static void printArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); // Adding a newline after printing all elements
    }

    // Method to check if an ArrayList contains a specific element
    public static boolean containsElement(ArrayList<Integer> list, int element) {
        return list.contains(element);
    }

    // Method to create and return a mixed ArrayList with different data types
    public static ArrayList<Object> createMixedList() {
        ArrayList<Object> mixedList = new ArrayList<>();
        mixedList.add(69420); // Integer
        mixedList.add("Batman"); // String
        mixedList.add('P'); // Character
        return mixedList;
    }
}
