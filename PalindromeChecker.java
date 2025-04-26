public class PalindromeChecker {
    static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {"abcdcba", "level", "noon", "radar", "madam", "", "a", "ab", "aba", "abb", "racecar", "hello", "Palindrome"};

        for (String str : tests) {
            System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str));
        }
    }
}
