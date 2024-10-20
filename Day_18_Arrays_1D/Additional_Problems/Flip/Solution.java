
public class Solution {
    public int[] flip(String A) {
        int n = A.length();
        int[] arr = new int[n];
        
        // Convert the string into an array of 1s and -1s
        for (int i = 0; i < n; i++) {
            arr[i] = (A.charAt(i) == '0') ? 1 : -1;
        }

        int maxSum = 0, currentSum = 0;
        int start = 0, end = -1, tempStart = 0;
        
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            
            // If current sum goes negative, reset it
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // If no beneficial flip is possible
        if (end == -1) {
            return new int[] {};
        }
        
        // Return 1-based indices
        return new int[] { start + 1, end + 1 };
    }
}
