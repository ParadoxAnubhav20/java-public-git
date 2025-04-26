import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Asking user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Creating an array of given size
        int[] array = new int[size];
        // Taking input for each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        // Printing the original array
        System.out.println("The array you entered is:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        // Reversing the array
        reverse(array);
        // Printing the reversed array
        System.out.println("\nThe reversed array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        // Closing the scanner
        scanner.close();
    }

    static void swap(int[] arr, int ele1, int ele2) {
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }

    static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}

/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        
        reverseArray(array);
        
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move indices towards the middle
            start++;
            end--;
        }
    }
}

 

 */