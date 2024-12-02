public class Solution {
    public int solve(int A, int[] B) {
        Set<Integer> hs = new HashSet<>();

        for(int i=0; i<B.length; i++){
            int partner = A - B[i];
            if(hs.contains(partner) == true){
                return 1;
            }
            hs.add(B[i]);
        }

        return 0;
    }
}
