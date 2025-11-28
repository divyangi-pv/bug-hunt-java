/**
 * Utility class for string operations.
 * Contains 2 bugs for you to find and fix!
 */
public class StringUtils {
    
    /**
     * Reverse a string
     */
    public String reverse(String str) {
        if (str == null) return null;
        
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    
    /**
     * Check if a string is a palindrome
     */
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = reverse(cleaned);
        
        // BUG #3: Using == instead of .equals() for string comparison
        return cleaned == reversed;
    }
    
    /**
     * Count the number of vowels in a string
     */
    public int countVowels(String str) {
        if (str == null) return 0;
        
        int count = 0;
        String vowels = "aeiou";  // BUG #4: Missing uppercase vowels
        
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Capitalize the first letter of each word
     */
    public String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}
