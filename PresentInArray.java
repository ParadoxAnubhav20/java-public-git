import java.util.*;

public class PresentInArray {
    // Function to create an array representing frequency of elements
    static int[] createFrequencyArray(int[] arr) {
        // Assuming maximum element value to be 100100
        int[] freqArray = new int[100100];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i]]++;
        }
        return freqArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] freq = createFrequencyArray(arr);
        System.out.print("Enter the number of queries: ");
        int queries = scanner.nextInt();
        while (queries != 0) {
            System.out.print("Enter the element to be searched: ");
            int x = scanner.nextInt();
            if (freq[x] > 0) {
                System.out.println("Element Present");
            } else {
                System.out.println("Element Not Present");
            }
            queries--;
        }
        scanner.close();
    }
}
