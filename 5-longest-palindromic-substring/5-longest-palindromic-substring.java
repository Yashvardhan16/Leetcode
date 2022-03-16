class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()<1) return "";
        int start=0;
        int end =0;
        
        for(int i=0;i<s.length();i++){
            int len = helper(s,i,i);
            int len2 = helper(s,i,i+1);
            //for case "aabbaa" handling
            int len3 = Math.max(len,len2);
            if(len3>end-start){
                start = i - ((len3-1)/2);
                end = i +(len3)/2;
            }
        }
        return s.substring(start,end+1);
    }
    int helper(String s,int left,int right){
        if(s==null || left>right) return 0;
        
        //racecar expand and check for each value from 'e'
 while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
     left--;
     right++;
 }
        return right-left-1;
    }
}