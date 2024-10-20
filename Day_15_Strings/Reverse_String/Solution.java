public class Solution {
    public String solve(String A) {
        StringBuilder reverse = new StringBuilder();
        String[] words = A.trim().split("\\s+");

        //reverse the order of words
        for(int i=words.length - 1; i>=0; i--)
        {
            reverse.append(words[i]).append(" ");
        }
        return reverse.toString().trim();
    }
}
