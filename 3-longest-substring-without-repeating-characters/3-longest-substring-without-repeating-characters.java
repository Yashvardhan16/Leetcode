class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int left =0;
        int right = 0;
        int len =0;
        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                len = Math.max(len,set.size());
            }else if(set.contains(s.charAt(left))){
                set.remove(s.charAt(left));
                left++;
            }
        }
        return len;
    }
}