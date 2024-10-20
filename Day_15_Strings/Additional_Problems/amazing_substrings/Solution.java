public class Solution {
    public int solve(String S) {
        int n = S.length();
        int count = 0;
        int mod = 10003;
        
        // Iterate over each character in the string
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            // Check if the character is a vowel
            if (isVowel(ch)) {
                // Count all substrings starting from this character
                count = (count + (n - i)) % mod;
            }
        }
        return count;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Make case insensitive
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
