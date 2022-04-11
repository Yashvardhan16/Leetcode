class Solution {
//     Map<String,Boolean> map = new HashMap<>();
//     public boolean wordBreak(String s, List<String> wordDict) {
//         if(wordDict.contains(s)) return true;
//         if(map.containsKey(s)) return map.get(s);
        
//         for(int i=1;i<=s.length();i++){
//             String left = s.substring(0,i);
//             if(wordDict.contains(left) && wordBreak(s.substring(i),wordDict)){
//                 map.put(s,true);
//                 return true;
//             }
//         }
//         map.put(s,false);
//         return false;
    public boolean wordBreak(String s, List<String> wordDict){
        boolean[] dp = new boolean[s.length()+1];
        Set<String> set = new HashSet(wordDict);
        dp[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                break;
                }
            }
        }
     return dp[s.length()];
    }
}