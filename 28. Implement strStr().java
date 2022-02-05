//Solution 1

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
         int m = needle.length();
          for(int i=0;i<=n-m;i++){
              int j=0;
           for( j=0;j<m;j++){
            if(needle.charAt(j)==haystack.charAt(j+i)){
                continue;
            }
         else{
             break;
         }
        }if(j==needle.length()){
               return i;
           }
          }
        return -1;
    }
}

//Solution 2

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0 && needle.length()==0) return 0;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
