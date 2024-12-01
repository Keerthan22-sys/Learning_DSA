public class Solution {
    public int solve(int[] A) {
        int max = A[0];
        int count = 0;

        for(int num : A)
        {
            if(num > max)
                max = num;
        }

        for(int num : A)
        {
            if(num < max)
                count++;
        }
        return count;
    }
}
