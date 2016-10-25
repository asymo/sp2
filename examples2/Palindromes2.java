/**
 * This program checks whether a word is a palindrome (disregarding
 * non-letter symbols and letter case) without constructing intermediate
 * String objects. Based on material from "Java for Everyone" by Cay
 * Horstmann.
 */
public class Palindromes2 {

    public static void main(String[] args) {
        String sentence1 = "Madam, I'm Adam!";
        System.out.println(sentence1);
        System.out.println("Palindrome: " + isPalindrome(sentence1));
        String sentence2 = "Sir, I'm Eve!";
        System.out.println(sentence2);
        System.out.println("Palindrome: " + isPalindrome(sentence2));
    }

    /**
     *  Tests whether a text is a palindrome.
     *  @param text a string that is being checked
     *  @return true if text is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String text) {
        return isPalindrome(text, 0, text.length() - 1);
    }

    /**
     * Tests whether a substring is a palindrome.
     * @param text a string that is being checked
     * @param start the index of the first character of the substring
     * @param end the index of the last character of the substring
     * @return true if the substring is a palindrome
     */
    public static boolean isPalindrome(String text, int start, int end) {
        // Separate case for substrings of length 0 and 1.
        if (start >= end) { return true; }
        else {
            // Get first and last characters, converted to lowercase.
            char first = Character.toLowerCase(text.charAt(start));
            char last = Character.toLowerCase(text.charAt(end));
            if (Character.isLetter(first) && Character.isLetter(last)) {
                if (first == last) {
                    return isPalindrome(text, start + 1, end - 1);
                } else {
                    return false;
                }
            } else if (!Character.isLetter(last)) {
                return isPalindrome(text, start, end - 1);
            } else {
                return isPalindrome(text, start + 1, end);
            }
        }
    }
}
