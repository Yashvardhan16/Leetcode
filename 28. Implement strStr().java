class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        } int index =0;
         if(haystack.contains(needle)){
            index= haystack.indexOf(needle) ;
        }
        return index;
}}
