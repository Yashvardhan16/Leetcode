class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        lps[0] =0;
        int len=0;
        int i =1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else if(len==0){
                lps[i] = len;
                i++;
            }else{
                len = lps[len-1];
            }
        }
        return s.substring(0,len);
    }
}