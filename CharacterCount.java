public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "success";
        char targetCharacter = 'S';
        int occurrenceCount = countCharacterOccurrences(inputString, targetCharacter);
        System.out.println("The character '" + targetCharacter + "' appears " + occurrenceCount + " times.");
    }

    public static int countCharacterOccurrences(String input, char target) {
        int count = 0;
        char normalizedTarget = Character.toLowerCase(target);

        for (int i = 0; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) == normalizedTarget) {
                count++;
            }
        }

        return count;
    }
}

// public static int countOccurences(String s, char c) {
//     // Convert both string and character to lowercase
//     s = s.toLowerCase();
//     c = Character.toLowerCase(c);
    
//     int count = 0;
//     for(int i = 0; i < s.length(); i++) {
//         if(s.charAt(i) == c) {
//             count++;
//         }
//     }
//     return count;
// }
