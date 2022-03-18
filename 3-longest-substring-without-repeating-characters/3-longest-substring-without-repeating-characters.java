class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0) return 0;
        if(s.length()==1) return 1;
        int left=0;
        int right =0;
        Set<Character> set = new HashSet<>();
        int maxlen=0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxlen = Math.max(maxlen,set.size());
            }
            else if(set.contains(s.charAt(left))){
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}