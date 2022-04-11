class Solution {
    // HashMap
    Map<String,Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)) return true;
        if(map.containsKey(s)) return map.get(s);
        //set for the sole purpose of time complexity
        Set<String> set = new HashSet(wordDict);
        for(int i=0;i<s.length();i++){
            String left = s.substring(0,i);
      if(set.contains(left) && wordBreak(s.substring(i),wordDict)){
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
}
    //dp solution
    // public boolean wordBreak(String s, List<String> wordDict){
     //    boolean[] dp = new boolean[s.length()+1];
     //    Set<String> set = new HashSet(wordDict);
     //    dp[0] = true;
     //    for(int i=1;i<=s.length();i++){
     //        for(int j=0;j<=i;j++){
     //            //set for improving the time complexity
     //            //dp[j] is the string covered so far
     //            if(dp[j] && set.contains(s.substring(j,i))){
     //                dp[i] = true;
     //            break;
     //            }
     //        }
     //    }
     // return dp[s.length()];
        
    //BackTracking
//     public boolean wordBreak(String s, List<String> wordDict) {
//   
//   return backtracking(0, s, new HashSet<>(wordDict));
// }

// private boolean backtracking(int depth, String s, Set<String> wordSet) {
//   int n = s.length();
//   // accept
//   if (depth == n) {
//     return true;
//   }
  
//   for (int i = depth; i < n; ++i) {
//     String str = s.substring(depth, i + 1); // substring[depth, i]
//     if (wordSet.contains(str)) {
//       if (backtracking(i + 1, s, wordSet)) return true;
//     }
//   }
  
//   return false;
// }
//     }