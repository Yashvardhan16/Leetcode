class Solution {
    public int reverse(int x) {
        long ans =0;
        while(x!=0){
            ans = ans*10 + x%10;
            x/=10;
        }
        while(ans<=Integer.MAX_VALUE && ans>=Integer.MIN_VALUE){
        return (int)ans;
        }
        return 0;
    }
}