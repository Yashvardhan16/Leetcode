class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int k =1;
        int left=0;
        int right = n-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return Palindromecheck(s,left+1,right) || Palindromecheck(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    boolean Palindromecheck(String s, int left,int right){
        while(left<right){
             if(s.charAt(left++)!=s.charAt(right--)) {
                 return false;
        }
    }
        return true;
}
}
