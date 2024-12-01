public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {

                int ones = 0, twos = 0;

        for (int num : A) {
            // Update `twos` with bits that appear twice
            twos |= ones & num;
            // Update `ones` with bits that appear once
            ones ^= num;
            // Get the bits that appear three times
            int threes = ones & twos;
            // Remove the bits that appear three times from `ones` and `twos`
            ones &= ~threes;
            twos &= ~threes;
        }

        return ones; // `ones` contains the number that appears once
    }
}
