import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the key to search for: ");
        int key = scanner.nextInt();

        int position = linearSearch(arr, key);

        if (position == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + position);
        }

        scanner.close();
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index of the key if found
            }
        }
        return -1; // Return -1 if key is not found in the array
    }
}
