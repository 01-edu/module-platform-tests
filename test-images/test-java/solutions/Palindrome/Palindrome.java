public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;
            
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters at left and right positions don't match
            }
            left++;
            right--;
        }
        
        return true; // All characters matched, it's a palindrome
    }
}
