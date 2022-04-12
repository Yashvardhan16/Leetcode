class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left =0;
        int right = 0;
        Set<Character> set = new HashSet();
        int max_len =0;
        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max_len = Math.max(max_len,set.size());
            }
            else if(set.contains(s.charAt(left))){
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max_len;
    }
}