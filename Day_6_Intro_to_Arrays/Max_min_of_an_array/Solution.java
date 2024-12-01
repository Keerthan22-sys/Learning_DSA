public class Solution {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : A)
        {
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return max+min;

    }
}
