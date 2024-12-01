public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int minPrice = A[0];
        int maxProfit = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < minPrice) {
                minPrice = A[i];
            } else {
                maxProfit = Math.max(maxProfit, A[i] - minPrice);
            }
        }

        return maxProfit;
    }
}

