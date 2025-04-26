import java.util.*;

class ArrayListReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        // Create an ArrayList to store integers
        ArrayList<Integer> tempList = new ArrayList<>(size);
        System.out.println("Enter " + size + " integers:");

        // Populate the ArrayList with integers entered by the user
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            tempList.add(num);
        }

        // Display the original list
        System.out.println("Original list: " + tempList);

        // Reverse the list
        reverseList(tempList);

        // Display the reversed list
        System.out.println("Reversed list: " + tempList);
        
        scanner.close();
    }

    // Method to reverse the elements of an ArrayList
    public static void reverseList(ArrayList<Integer> arr) {
        int start = 0, end = arr.size() - 1;
        
        // Swap elements symmetrically from both ends
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
