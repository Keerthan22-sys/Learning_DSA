public class Solution {
    public int numSetBits(int A) {
        int count = 0;
        while (A > 0) {
            count += (A & 1); // Add 1 if the last bit is 1
            A >>= 1;         // Right shift A by 1 to process the next bit
        }
        return count;
    }
}
