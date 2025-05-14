public class AlmostPalindrome {

    public static boolean isAlmostPalindrome(String s) {
        s = s.toLowerCase();
        if(isPalindrome(s))
            return false;
        for (int i = 0; i < s.length(); i++) {
            // Generate a new string by removing the character at position i
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            String modifiedString = sb.toString();

            // Check if the new string is a palindrome
            if (isPalindrome(modifiedString)) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check if a string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
