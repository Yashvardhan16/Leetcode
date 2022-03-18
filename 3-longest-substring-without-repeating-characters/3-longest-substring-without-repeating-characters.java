class Solution {
    public int lengthOfLongestSubstring(String s) {
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