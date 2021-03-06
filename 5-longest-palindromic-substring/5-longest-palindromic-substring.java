class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()<1) return "";
        int start=0,end=0;
        
        for(int i=0;i<s.length();i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len3 = Math.max(len1,len2);
            if(len3>end-start){
                start= i - (len3-1)/2;
                end = i + (len3)/2;
            }
        }
       return s.substring(start,end+1);
        
    }
    int expand(String s ,int left,int right){
        if(s==null|| left>right) return 0;
        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right - left-1;
    }
}