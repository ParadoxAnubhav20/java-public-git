import java.util.Scanner;

public class ArrayOperations {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] findLargestSmallest(int[] arr) {
        int[] result = new int[2]; // result[0] will be largest, result[1] will be smallest
        result[0] = arr[0]; // Largest
        result[1] = arr[0]; // Smallest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result[0]) {
                result[0] = arr[i];
            }
            if (arr[i] < result[1]) {
                result[1] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter The Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sum of the Array Elements is: " + arraySum(arr));

        int[] result = findLargestSmallest(arr);
        System.out.println("Largest Element is: " + result[0]);
        System.out.println("Smallest Element is: " + result[1]);

        scanner.close();
    }
}
