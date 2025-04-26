import java.util.*;

public class StringToggler {
    public static String toggleString(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                ans.append(Character.toUpperCase(ch));
            } else {
                ans.append(Character.toLowerCase(ch));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to Toggle: ");
        String str = sc.nextLine(); 
        System.out.println("Toggled String: " + toggleString(str));
        sc.close();  // Close the scanner
    }
}
