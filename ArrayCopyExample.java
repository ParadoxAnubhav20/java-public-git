// ArrayCopyExample class demonstrates copying an array in Java.

class ArrayCopyExample {
    // Method to print elements of an array.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Original array declaration and initialization.
        int[] originalArray = {3, 1, 5, 6, 9};
        
        // Creating a copy of the original array.
        int[] copiedArray = originalArray.clone();
        
        // Displaying the original array.
        System.out.print("Original Array: ");
        printArray(originalArray);
        
        // Displaying the copied array.
        System.out.print("Copied Array: ");
        printArray(copiedArray);
        
        // Modifying the copied array.
        copiedArray[1] = 99;
        copiedArray[3] = 69;
        
        // Displaying the original array after modification.
        System.out.print("Original Array after modification: ");
        printArray(originalArray);
        
        // Displaying the copied array after modification.
        System.out.print("Copied Array after modification: ");
        printArray(copiedArray);
    }
}
