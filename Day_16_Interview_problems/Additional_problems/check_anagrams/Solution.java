import java.util.Arrays;

public class Solution {
    public int solve(String A, String B) {
        // Check if lengths are different
        if (A.length() != B.length()) {
            return 0; // Not anagrams
        }

        // Convert strings to character arrays and sort them
        char[] charArrayA = A.toCharArray();
        char[] charArrayB = B.toCharArray();
        
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        
        // Compare sorted character arrays
        return Arrays.equals(charArrayA, charArrayB) ? 1 : 0;
    }
}