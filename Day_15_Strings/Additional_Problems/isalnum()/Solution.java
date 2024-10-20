public class Solution {
    public int solve(char[] A) {
        
        for (char c : A) {
            // Check if the character is not alphanumeric
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return 0; // Found a non-alphanumeric character
            }
        }
        return 1; // All characters are alphanumeric
    }
}
