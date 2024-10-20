public class Solution {
    public int solve(String A) {
        int count = 0;
        int n = A.length();
        
        // Iterate through the string, checking for "bob"
        for (int i = 0; i <= n - 3; i++) {
            // Check if the substring from i to i+2 is "bob"
            if (A.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        
        return count;
    }
}
