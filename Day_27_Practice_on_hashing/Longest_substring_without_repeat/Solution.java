public class Solution {
    public static int max(int A, int B){
        if(A > B){
            return A;
        }
        else{
            return B;
        }
    }
    public int lengthOfLongestSubstring(String A) {
        int N = A.length();
        int ans = 0, s = 0;
        Set<Character> hs = new HashSet<>();

        for(int e=0; e<N; e++){
            while(hs.contains(A.charAt(e)) == true){
                hs.remove(A.charAt(s));
                s++;
            }
            hs.add(A.charAt(e));
            ans = max(ans, hs.size());
        }
        return ans;
    }
}
