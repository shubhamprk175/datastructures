// Remove a character from a string recursively/iteratively.
/* Link to the Problem: https://www.geeksforgeeks.org/remove-all-occurrences-of-a-character-in-a-string-recursive-approach/
 * Test Cases
 * Input: text = “firebreather”, ch = ‘e’ 
 * Output: firbrathr
 * Input: text = "Mississippi", ch = ‘s’ 
 * Output: Miiippi
 */

public class RemoveCharacter {
    public static void removeCharacterIter(String text, char ch) {
        String newString = "";
        for (int idx = 0; idx < text.length(); idx++) {
            if (text.charAt(idx) != ch) {
                newString += text.charAt(idx);
            }
        }
        System.out.println("Removed character: " + newString);
    }

    public static String removeCharacterRecur(String text, char ch, int idx) {
        if (text.length() == 0)	return "";
        if (text.charAt(idx) != ch) {
            return text.charAt(idx) + removeCharacterRecur(text.substring(idx+1), ch, idx);
        }
        else {
            return removeCharacterRecur(text.substring(idx+1), ch, idx);
        }
    }

    private static void testCases() {
        removeCharacterIter("aaaaaa", 'b');
        removeCharacterIter("aaaaaa", 'a');
        System.out.println(removeCharacterRecur("Siddhartha", 'd', 0));
        System.out.println(removeCharacterRecur("ABCCDE",'c',0));
    }

    public static void main(String[] args) {
        testCases();
    }
}
