public class Solution {
    public String solve(String A) {
        char arr[] = A.toCharArray();
         int N=arr.length;
        for(int i=0; i<N; i++)
        {
            if(arr[i] >= 'A' && arr[i] <= 'Z')
            {
                arr[i] = (char) (arr[i] + 32);
            }
            else{
                arr[i] = (char) (arr[i] - 32);
            }
        }
        return new String(arr);
    }
}
