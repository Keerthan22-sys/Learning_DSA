public class Solution {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public String longestPalindrome(String A) {
        int n = A.length();
        char arr[] = A.toCharArray();
        int start = 0, maxLen = 0;

        if (n == 0) {
            return "";
        }

        for (int c = 0; c < n; c++) {
            // Case 1: Odd-length palindrome (single character center)
            int l = c, r = c;
            while (l >= 0 && r < n && arr[l] == arr[r]) {
                l--;
                r++;
            }
            // Check if the current palindrome is the longest one
            if (r - l - 1 > maxLen) {
                maxLen = r - l - 1;
                start = l + 1;
            }

            // Case 2: Even-length palindrome (two characters center)
            l = c;
            r = c + 1;
            while (l >= 0 && r < n && arr[l] == arr[r]) {
                l--;
                r++;
            }
            // Check if the current palindrome is the longest one
            if (r - l - 1 > maxLen) {
                maxLen = r - l - 1;
                start = l + 1;
            }
        }

        // Return the longest palindromic substring
        return A.substring(start, start + maxLen);
    }
}
