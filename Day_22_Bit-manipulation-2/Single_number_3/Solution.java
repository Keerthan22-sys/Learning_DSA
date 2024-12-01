public class Solution {
    public int[] solve(int[] A) {

                int xor = 0;
        
        // Step 1: XOR all elements to get the combined result of the two unique numbers
        for (int num : A) {
            xor ^= num;
        }

        // Step 2: Find a differentiating bit (rightmost set bit)
        int diffBit = xor & -xor;

        int num1 = 0, num2 = 0;

        // Step 3: Partition the numbers into two groups and XOR them
        for (int num : A) {
            if ((num & diffBit) == 0) {
                num1 ^= num; // Group with the differentiating bit not set
            } else {
                num2 ^= num; // Group with the differentiating bit set
            }
        }

        // Step 4: Return the two unique numbers in ascending order
        return new int[] { Math.min(num1, num2), Math.max(num1, num2) };
    }
}

