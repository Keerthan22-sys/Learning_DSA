package Largest_coprime_divisor;
public class Solution {
    public int gcd(int A, int B) {
        if(B == 0){
            return A;
        }
        else{
            return gcd(B, A%B);
        }
    }
}
