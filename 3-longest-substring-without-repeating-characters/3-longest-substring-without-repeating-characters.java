class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;int right=0;
        Set<Character> set = new HashSet();
        int maxlen=0;
        while(right<s.length()){
            //add chars to set and increment right pointer to find the maxlength of substring without duplicates
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxlen= Math.max(maxlen,set.size());
                //Set remove prev element if duplicate found and move the sliding window ahead
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}