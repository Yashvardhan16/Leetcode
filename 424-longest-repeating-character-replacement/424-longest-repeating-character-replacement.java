class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left=0;
        int max_len =0;
        int max_count =0;
        int[] char_counts = new int[26];
        for(int right=0;right<n;right++){
            char_counts[s.charAt(right)-'A']++;
           int current_char_counts = char_counts[s.charAt(right)-'A'];
            max_count = Math.max(max_count,current_char_counts);
            // System.out.println(max_count);
         
            while(right - left - max_count +1>k){
                char_counts[s.charAt(left)-'A']--;
                left++;
            }
            max_len = Math.max(max_len,right-left+1);
        }
        return max_len;
    }
}