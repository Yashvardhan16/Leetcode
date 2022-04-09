class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
         int m = needle.length();
        
        if(!haystack.contains(needle)) return -1;
        int index =0;
        for(int i=0;i<n-m+1;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                index = i;
                break;
            }
        }
        return index;
        //   for(int i=0;i<=n-m;i++){
        //       int j=0;
        //    for( j=0;j<m;j++){
        //     if(needle.charAt(j)==haystack.charAt(j+i)){
        //         continue;
        //     }
        //  else{
        //      break;
        //  }
        // }if(j==needle.length()){
        //        return i;
        //    }
        //   }
        // return -1;
    }
}