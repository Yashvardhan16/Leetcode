class Solution {
   
    public int countSubstrings(String s) {
              if(s==null || s.isEmpty()) return 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            count += extendPalindrom(s, i, i) + extendPalindrom(s, i, i+1);
        }
        return count;
    }
    
    private int extendPalindrom(String s, int left, int right){
        int count = 0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}