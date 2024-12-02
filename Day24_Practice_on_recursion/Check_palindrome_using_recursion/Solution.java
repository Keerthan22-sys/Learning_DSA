public class Solution {

    // Helper function to check palindrome recursively
    private boolean isPalindromeHelper(String A, int start, int end) {
        if (start >= end) {
            return true; // Base case: if pointers have met or crossed, it's a palindrome
        }
        if (A.charAt(start) != A.charAt(end)) {
            return false; // If characters at start and end don't match, it's not a palindrome
        }
        return isPalindromeHelper(A, start + 1, end - 1); // Recursive call moving towards the center
    }

    public int solve(String A) {
        return isPalindromeHelper(A, 0, A.length() - 1) ? 1 : 0;
    }
}
