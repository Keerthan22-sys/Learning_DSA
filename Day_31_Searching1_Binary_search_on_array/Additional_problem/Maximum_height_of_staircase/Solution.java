public class Solution {
    public int maximumHeight(int A) {
        // If there are no blocks, the height is 0
        if (A == 0) {
            return 0;
        }
        
        // Initialize binary search bounds
        int low = 0, high = A;
        int result = 0;
        
        // Perform binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sum = (long) mid * (mid + 1) / 2; // Sum of first 'mid' numbers
            
            if (sum == A) {
                return mid;  // If sum equals A, return mid
            } else if (sum < A) {
                result = mid;  // Store mid as the current best answer
                low = mid + 1; // Move to the higher half
            } else {
                high = mid - 1; // Move to the lower half
            }
        }
        
        return result; // Return the best found height
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        System.out.println(solution.maximumHeight(8));  // Expected Output: 3
        
        // Test case 2
        System.out.println(solution.maximumHeight(10)); // Expected Output: 4
        
        // Test case 3
        System.out.println(solution.maximumHeight(0));  // Expected Output: 0
    }
}
