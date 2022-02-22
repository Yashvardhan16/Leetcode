class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int curr = -n;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                curr =i;
            }
            ans[i] = i - curr;
        }
         for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                curr =i;
            }
            ans[i] = Math.min(ans[i],Math.abs(i-curr));
        }
        
        return ans;
    }
}
