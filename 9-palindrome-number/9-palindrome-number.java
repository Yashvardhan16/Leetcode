class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int ans = 0;
        while(x>0){
            ans = ans*10 + x%10;
            x /=10; 
        }
        if(ans==temp) return true;
        else return false;
    }
}