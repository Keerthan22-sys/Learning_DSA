public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num; // XOR all elements
        }
        return result;
    }
}
