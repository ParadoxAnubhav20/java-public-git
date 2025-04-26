import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Value and Ending Value:");
        int s = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<Integer> ans = printPrimeNos(s, e);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static ArrayList<Integer> printPrimeNos(int start, int end) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
