class Solution {
    public boolean isPalindrome(int n) {
     int ans=0;
        int temp=n;
        while(n>0){
            ans=ans*10+n%10;
            n/=10;
        }
        if(ans==temp){
            return true;
        }
        return false;
    }
}