public class Solution {
    public String longestCommonPrefix(String[] A) {
        if (A == null || A.length == 0) return "";
        
        // Take the first string as a reference for comparison
        StringBuilder prefix = new StringBuilder();
        String firstString = A[0];
        
        // Character by character comparison
        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);
            
            // Check if all other strings have the same character at position i
            for (int j = 1; j < A.length; j++) {
                if (i >= A[j].length() || A[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            
            // Add current character to the prefix
            prefix.append(currentChar);
        }
        
        return prefix.toString();
    }
}
