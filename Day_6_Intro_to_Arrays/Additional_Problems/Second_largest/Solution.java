public class Solution {
    public int solve(int[] A) {
        if(A.length < 2)
        {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int num : A)
        {
            if(num > largest)
            {
                second_largest = largest;
                largest = num;
            }
            else if(num > second_largest && num < largest) {
                second_largest = num;
            }
        }

        return second_largest == Integer.MIN_VALUE ? -1:second_largest;
    }
}
