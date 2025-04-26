public class SearchInString {
    public static void main(String[] args) {
        String s = "Anubhav";
        char target = 'u';
        System.out.println(linearSearchString(s, target));
    }

    static boolean linearSearchString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
